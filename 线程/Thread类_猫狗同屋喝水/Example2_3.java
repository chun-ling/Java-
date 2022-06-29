package Thread类_猫狗同屋喝水;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 11:11
 */
public class Example2_3 {
    public static void main(String[] args) {
        House house = new House();
        house.setWaterAmount(10);
        Thread dog;
        Thread cat;
        dog = new Thread(house);//两个线程使用同一个目标对象
        cat = new Thread(house);
        dog.setName("狗");//线程中的方法，设置名字
        cat.setName("猫");
        dog.start();
        cat.start();
    }
}
