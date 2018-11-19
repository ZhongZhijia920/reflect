package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @program: HelloWOrld
 * @description:
 * @create: 2018-11-15 22:19
 **/
public class MethodDemo_4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("hello");
        //list1.add(20);错误

        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1==c2);
        //反射的操作都是编译之后的操作

        /**
         * c1==c2结果返回true说明编译之后集合的泛型都去泛型化的
         * Java中集合的泛型，是防止错误输入的，只在编译阶段有效
         * 绕过编译就无效了
         * 验证:通过方法的反射来操作，绕过编译
         */

        try {
            Method m = c1.getMethod("add",Object.class);
            m.invoke(list1,101);//绕过编译操作就绕过泛型
            System.out.println(list1.size());
            System.out.println(list1);
            for (String s : list1) {
                System.out.println(s);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
