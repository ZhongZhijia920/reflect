package reflect;

/**
 * @program: HelloWOrld
 * @description:����Ա������Ϣ
 * @create: 2018-11-15 21:22
 **/
public class ClassDemo_4 {
    public static void main(String[] args) {
        ClassUtil.printFieldMessage("hello");
        System.out.println("==============");
        ClassUtil.printFieldMessage(new Integer(1));
    }

}
