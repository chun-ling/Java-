package 泛型与集合框架;

import java.time.LocalTime;

public class Example15_1 {
    public static void main(String args[]) {
        People<LocalTime> zhang = new People<LocalTime>();
        zhang.setFriend(LocalTime.now());
        LocalTime zhangFriend = zhang.getFriend();
        System.out.println(zhangFriend);

        People<Double>geng = new People<Double>();
        geng.setFriend(1.618);
        double gengFriend = geng.getFriend();
        System.out.println(gengFriend);

        People<String> tom = new People<String>();
        tom.setFriend("我的好朋友Jerry");
        String jerry = tom.getFriend();
        System.out.println(jerry);

        People2 mike = new People2();
        mike.setFriend("我的好朋友John");
        String John = mike.getFriend();
        System.out.println(John);

        People3 yu = new People3();
        yu.setYu(5.6);
        double yuFriednd = yu.getYu();
        System.out.println(yuFriednd);


    }

}
