package reflect;

/**
 * @program: HelloWOrld
 * @description:看成员变量信息
 * @create: 2018-11-15 21:22
 **/
public class ClassDemo_4 {
    public static void main(String[] args) {
        ClassUtil.printFieldMessage("hello");
        System.out.println("==============");
        ClassUtil.printFieldMessage(new Integer(1));
    }

}
