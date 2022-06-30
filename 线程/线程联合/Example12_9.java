package 线程联合;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 11:00
 */
public class Example12_9 {
    public static void main(String[] args) {
        cakeHouse cakeHouse = new cakeHouse();
        cakeHouse.customer.setName("顾客");
        cakeHouse.cakeMaker.setName("蛋糕师");
        cakeHouse.customer.start();
    }
}
