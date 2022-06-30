package 同步线程;

/**
 * @author YUChangcan
 * @date 2022/6/30 - 9:55
 */
public class Example12_7 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setMoney(200);
        Thread account = new Thread(bank);
        Thread cashier = new Thread(bank);
        account.setName("会计");
        cashier.setName("出纳");
        account.start();
        cashier.start();
    }
}
