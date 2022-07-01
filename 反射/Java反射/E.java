package Java反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author YUChangcan
 * @date 2022/7/1 - 9:16
 */
public class E {
    public static void main(String[] args) {
        Rect rect = new Rect();
        Class cs = rect.getClass();
        System.out.println(cs == Rect.class);
        String className = cs.getName();
        Constructor[]con = cs.getConstructors();
        Field[] field = cs.getDeclaredFields();
        Method[] methods = cs.getDeclaredMethods();
        System.out.println("类的名字：" + className);
        System.out.println("类中有以下的构造方法：");
        for(int i = 0;i < con.length;i++){
            System.out.println(con[i].toString());
        }
        System.out.println("类中有以下的成员变量：");
        for(int i = 0;i < field.length;i++){
            System.out.println(field[i].toString());
        }
        System.out.println("类中有以下的方法：");
        for(int i = 0;i < methods.length;i++){
            System.out.println(methods[i].toString());
        }
    }
}
