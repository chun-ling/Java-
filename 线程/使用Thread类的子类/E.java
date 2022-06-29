package 使用Thread类的子类;

/**
 * @author YUChangcan
 * @date 2022/6/29 - 9:43
 */
public class E {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        lion.start();
        tiger.run();//必须调用start()方法才能进入线程排队，调用run()方法则只是一个普通的对象调用方法
        for(int i = 1;i <= 10;i++){
            System.out.println("我是华尔街之王" + i);
        }
        }
    }
