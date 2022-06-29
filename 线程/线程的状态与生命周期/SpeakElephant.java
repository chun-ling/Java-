package 线程的状态与生命周期;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:25
 */
public class SpeakElephant extends Thread{
    public void run(){
        for(int i = 1;i <= 20;i++){
            System.out.print("大象" + i + " ");
        }
    }

}
