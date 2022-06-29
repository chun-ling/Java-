package 线程的状态与生命周期;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:26
 */
public class SpeakCar extends Thread{//线程的子类，才会被JVM分配运行时间
    public void run(){//重写Thread类中的run()方法
        for(int i = 1;i <= 20;i++){
            System.out.print("车" + i + " ");
        }
    }

}
