package 同步线程;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 9:42
 */
public class Bank implements Runnable{
    private int money;
    public void setMoney(int m){
        money = m;
    }
    public void run(){
        if(Thread.currentThread().getName().equals("会计")){
            save(300);
        }else  if(Thread.currentThread().getName().equals("出纳")){
            take(150);
        }
    }

    private synchronized void take(int amount) {//必须waiting到当前使用该方法的线程使用完毕，之后的线程才能使用CPU
        int amountMoney = 0;
        for(int i = 1;i <= 3;i++){
            if(money >= 500){
                amountMoney = amount/2;
            }
            if(money >= 400&&money < 500){
                amountMoney = amount/3;
            }
            if(money >= 200&&money < 400){
                amountMoney = amount/5;
            }
            if(money < 200){
                amountMoney = amount/10;
            }
            money = money - amountMoney;
            System.out.println(Thread.currentThread().getName() + "取出" + amountMoney + "账上有" + money + "万，休息一下再取");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

    private synchronized void save(int amount) {
        for(int i = 1;i <= 3;i++){
            money = money + amount/3;
            System.out.println(Thread.currentThread().getName() + "存入" + amount/3 +"，账上有" + money + "万，休息一会再存");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("会计喝茶");
            }
        }

    }
}
