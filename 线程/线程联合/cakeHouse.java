package 线程联合;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 10:53
 */
public class cakeHouse implements Runnable{
    class Cake{
        int price;
        String name;
        Cake(String name,int price){
            this.name = name;
            this.price = price;
        }
    }

    Cake cake;
    Thread customer = new Thread(this);
    Thread cakeMaker = new Thread(this);
    public void run(){
        if(Thread.currentThread() == customer){
            System.out.println(customer.getName() + "等待" + cakeMaker.getName() + "制作生日蛋糕");
            try{
                cakeMaker.start();
                cakeMaker.join();//一个线程正在进行时，另一个线程join
            }catch (InterruptedException e){}
            System.out.println("顾客买走" + cake.name + "花了" + cake.price + "元");
        } else if (Thread.currentThread() == cakeMaker) {
            System.out.println(cakeMaker.getName() + "开始制作蛋糕，请等待两分钟");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}

            cake = new Cake("生日蛋糕",168);
            System.out.println(cakeMaker.getName() + "制作完毕");

        }
    }
}
