package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-15 21:56
 **/
public class MethodDemo_1 {
    public static void main(String[] args) {
        //��ȡprint(int,int)����
        //1.��ȡһ���������ǻ�ȡ�����Ϣ����ȡ���������
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 2.��ȡ���� ���ƺͲ����б�������
         * getMethod��ȡ����public�ķ���
         * getDeclaredMethod�Լ������ķ���
         */
        try {
            //Method m = c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print", int.class, int.class);
            //a1.print(10,20)�����ķ����������m������з�������
            //��a1.print(10,20)��Ч����ͬ
            //�������û�з���ֵnull,�з���ֵ���ؾ���ķ���ֵ
            Object o = m.invoke(a1,new Object[]{10,20});
            System.out.println("======================");
            //Method m = c.getMethod("print",new Class[]{String.class,String.class});
            Method m1 = c.getMethod("print", String.class, String.class);
            //�÷�������
            //a1.print("hello","World");
            o = m1.invoke(a1,"hello","world");

            System.out.println("======================");
            Method m2 = c.getMethod("print");
            o = m2.invoke(a1);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void print(){
        System.out.println("HelloWorld!");
    }
    public void print(int a, int b){
        System.out.println(a+b);
    }
    public void print(String a, String b){
        System.out.println(a.toUpperCase()+","+b.toUpperCase());
    }
}
