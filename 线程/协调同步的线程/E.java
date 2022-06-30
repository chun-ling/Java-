package 协调同步的线程;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 10:32
 */
public class E {
    public static void main(String[] args) {
        TicketHouse ticketHouse = new TicketHouse();
        Thread zhangfei = new Thread(ticketHouse);
        Thread likui = new Thread(ticketHouse);
        zhangfei.setName("张飞");
        likui.setName("李逵");
        zhangfei.start();
        likui.start();
    }
}
