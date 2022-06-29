package Thread类_猫狗同屋喝水;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 11:06
 */
public class House implements Runnable{
    int waterAmount;
    public void setWaterAmount(int w){
        waterAmount = w;
    }
    public void run(){
        while(true) {
            String name = Thread.currentThread().getName();
            if (name.equals("狗")) {
                System.out.println(name + "喝水");//输出语句可能导致线程结束
                waterAmount -= 2;//运算语句和赋值语句可能导致线程结束
            } else if (name.equals("猫")) {
                System.out.println(name + "喝水");
                waterAmount -= 1;
            }
            System.out.println("剩" + waterAmount);

            try {
                Thread.sleep(2000);//主动休息导致线程结束
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (waterAmount <= 0) {
                return;
            }
        }
    }
}
