package 线程的状态与生命周期;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:23
 */
public class Example12_1 {
    public static void main(String[] args) {//只有main这一个进程
        SpeakElephant speakElephant;
        SpeakCar speakCar;
        speakElephant = new SpeakElephant();//在进程中创建线程
        speakCar = new SpeakCar();//新建状态
        speakElephant.start();//可运行状态，但是JVM还没有运行该线程
        speakCar.start();
        for(int i = 1;i <= 15;i++){//此时该进程中有三个线程，被JVM轮流调用
            System.out.print("主人" + i + " ");
        }
    }
}
