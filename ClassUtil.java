package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-15 20:30
 **/
public class ClassUtil {
    /**
     * ��ӡ�����Ϣ��������Ա��������Ա����
     * obj�ö������������Ϣ
     */
    public static void printClassMessage(Object obj){
        //Ҫ��ȡ�����Ϣ ����Ҫ��ȡ�������
        Class c = obj.getClass();//���ݵ����ĸ�����Ķ���c���Ǹ����������
        //��ȡ�������
        System.out.println("���������:" + c.getName());
        /**
         * Method�࣬��������
         * һ����Ա������Ӧһ��Method����
         * getMethods()������ȡ��������public�ĺ�������������̳�����
         *getDeclaredMethods()��ȡ�������и����Լ������ķ��������ʷ���Ȩ��
         */
        Method[] ms = c.getMethods();//c.getDeclaredMethods()
        for(int i = 0; i < ms.length; i++){
            //�õ������ķ���ֵ���͵�������
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName() + " ");
            //�õ������ķ���ֵ����
            System.out.print(ms[i].getName() + "(");
            //��ȡ��������--->�õ������б����͵�������
            Class[] paramTypes = ms[i].getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }

    }

    /**
     * ��Ա����Ҳ�Ƕ���
     * java.lang.reflect.Field
     * Field���װ�˹��ڳ�Ա�����Ĳ���
     * getFields()������ȡ�������е�public�ĳ�Ա��������Ϣ
     *getDeclaredFields��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
     */
    public static void printFieldMessage(Object obj) {
        //Field[] fs = c.getFields();
        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field field:fs){
            //�õ���Ա���������͵�������
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            //�õ���Ա����������
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * ��ӡ����Ĺ��캯������Ϣ
     */
    public static void printConMessage(Object obj){
        Class c = obj.getClass();
        /**
         * ���캯��Ҳ�Ƕ���
         * java.lang.Constructor�з�װ�˹��캯������Ϣ
         */
        //Constructor[] cs = c.getConstructors();
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            System.out.print(constructor.getName()+"(");
            //��ȡ���캯���Ĳ����б�--->�õ����ǲ����б��������
            Class[] paraTypes = constructor.getParameterTypes();
            for (Class class1 : paraTypes) {
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");
        }
    }
}
