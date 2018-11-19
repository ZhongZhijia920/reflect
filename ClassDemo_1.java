package reflect;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-14 10:51
 **/
public class ClassDemo_1 {
    public static void main(String[] args) {
        //Foo的实例对象如何表示
        Foo foo1 = new Foo();//
        //Foo也是一个实力对象，Class类的实力对象
        //任何一个类都是Class类的实力对象，这个实例对象有三种表示方式

        //第一种表示方式------>实际任何一个类都有一个隐含的静态成员变量
        Class c1 = Foo.class;

        //第二种表达方式，已知该类的对象通过getClass方法
        Class c2 = foo1.getClass();

        //官网c1,c2表示Foo的类 类型(class type)
        /**
         * 万事万物皆对象，
         * 类也是对象
         */
        System.out.println(c1 == c2);

        //第三种表达方式
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
