package 用Class实例化一个对象;

import java.lang.reflect.Constructor;

/**
 * @author YUChangcan
 * @date 2022/7/1 - 9:52
 */
public class E {
    public static void main(String[] args) {
        try{
            Class<?>cs = Class.forName("用Class实例化一个对象.Circle");//软码，更灵活
            Constructor<?> constructor = cs.getDeclaredConstructor();//一个构造方法，不用数组
            Circle circle = (Circle) constructor.newInstance();//newInstance()使用new关键字实例化了一个对象
            circle.setRadius(100);
            double area = circle.getArea();
            String formatStr = String.format("%10.2f",area);
            System.out.println("circle的半径：" + circle.radius);
            System.out.println("circle的面积：" + formatStr);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
