package 使用Thread类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 10:47
 */
public class E {
    public static void main(String[] args) {
        Thread elephant;
        Thread mouse;
        Elephant e = new Elephant();
        Mouse m = new Mouse();
        elephant = new Thread(e);//使用Thread类创建线程时，必须有目标对象
        mouse = new Thread(m);//使线程进入新建状态

        elephant.start();
        mouse.start();
        for(int i = 1;i <= 10;i++){
            System.out.println("我有大脑子" + i);
        }


    }

}
