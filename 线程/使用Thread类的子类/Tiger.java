package 使用Thread类的子类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:41
 */
public class Tiger extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("我是森林之王" + i);
        }
    }
}
