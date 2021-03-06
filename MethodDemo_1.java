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
        //获取print(int,int)方法
        //1.获取一个方法就是获取类的信息，获取类的类类型
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 2.获取方法 名称和参数列表来决定
         * getMethod获取的是public的方法
         * getDeclaredMethod自己声明的方法
         */
        try {
            //Method m = c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print", int.class, int.class);
            //a1.print(10,20)方法的反射操作是用m对象进行方法调用
            //和a1.print(10,20)的效果不同
            //方法如果没有返回值null,有返回值返回具体的返回值
            Object o = m.invoke(a1,new Object[]{10,20});
            System.out.println("======================");
            //Method m = c.getMethod("print",new Class[]{String.class,String.class});
            Method m1 = c.getMethod("print", String.class, String.class);
            //用方法反射
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
