package reflect;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-14 10:51
 **/
public class ClassDemo_1 {
    public static void main(String[] args) {
        //Foo��ʵ��������α�ʾ
        Foo foo1 = new Foo();//
        //FooҲ��һ��ʵ������Class���ʵ������
        //�κ�һ���඼��Class���ʵ���������ʵ�����������ֱ�ʾ��ʽ

        //��һ�ֱ�ʾ��ʽ------>ʵ���κ�һ���඼��һ�������ľ�̬��Ա����
        Class c1 = Foo.class;

        //�ڶ��ֱ�﷽ʽ����֪����Ķ���ͨ��getClass����
        Class c2 = foo1.getClass();

        //����c1,c2��ʾFoo���� ����(class type)
        /**
         * ��������Զ���
         * ��Ҳ�Ƕ���
         */
        System.out.println(c1 == c2);

        //�����ֱ�﷽ʽ
        Class c3 = null;
        try {
            c3 = Class.forName("reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);
    }
}

class Foo{

}
