package 协调同步的线程;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 10:24
 */
public class TicketHouse implements Runnable{
    int fiveAmount = 2;
    int twentyAmount = 0;
    public void run(){
        if(Thread.currentThread().getName().equals("张飞")){
            saleTicket(20);
        }
        else if(Thread.currentThread().getName().equals("李逵")){
            saleTicket(5);
        }
    }

    private synchronized void saleTicket(int money) {
        if(money == 5){
            fiveAmount = fiveAmount + 1;
            System.out.println("给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "的钱正好");

        }else if(money == 20){
            while(fiveAmount < 3){
                try{
                    System.out.println("\n" + Thread.currentThread().getName() + "靠边等...");
                    wait();//只能在synchronized方法中使用,直到被notify方法唤醒
                    System.out.println("\n" + Thread.currentThread().getName() + "继续买票");
                }catch (InterruptedException e){}

            }
            fiveAmount = fiveAmount - 3;
            twentyAmount = twentyAmount + 1;
            System.out.println("给" + Thread.currentThread().getName() + "入场券，" + Thread.currentThread().getName() + "给20元，找赎15元");
        }
        notifyAll();
    }
}
