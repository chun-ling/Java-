package 使用Thread类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 10:47
 */
public class Mouse implements Runnable{
    public void run(){
        for(int i = 1;i <= 10;i++){
            System.out.println("我有长尾巴" + i);
        }
    }
}
