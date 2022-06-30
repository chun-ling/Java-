package 松耦合;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 8:08
 */
public class House implements Runnable{
    int waterAmount;
    Thread dog = new Thread(this);
    Thread cat = new Thread(this);
    public void setWaterAmount(int w){
        waterAmount = w;
    }
    public void run(){
        while(waterAmount >= 0) {
            if (Thread.currentThread() == dog) {
                System.out.println("家狗喝水");
                waterAmount -= 2;
            } else if (Thread.currentThread() == cat) {
                System.out.println("家猫喝水");
                waterAmount -= 1;
            }
            System.out.println("剩" + waterAmount);
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
