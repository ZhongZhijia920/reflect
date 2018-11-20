package reflect;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-15 20:07
 **/
public class ClassDemo_2 {
    public static void main(String[] args) {
        Class c1 = int.class;//int的类类型
        Class c2= String.class;
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());//不带包名的名称
    }
}
