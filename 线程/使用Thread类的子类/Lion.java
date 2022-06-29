package 使用Thread类的子类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:49
 */
public class Lion extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("我是草原之王" + i);
        }
    }
}
