package 使用Thread类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 10:42
 */
public class Elephant implements Runnable{//创建目标对象的类必须实现Runnable接口
    public void run(){
        for(int i = 1;i <= 10;i++){
            System.out.println("我有长鼻子" + i);
        }
    }
}
