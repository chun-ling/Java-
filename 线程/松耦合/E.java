package 松耦合;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 8:13
 */
public class E {
    public static void main(String[] args) {
        House house = new House();
        house.setWaterAmount(10);
        house.dog.start();
        house.cat.start();
    }
}
