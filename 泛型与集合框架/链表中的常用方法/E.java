package 链表中的常用方法;

import java.util.LinkedList;
import java.util.List;

public class E {
    public static void main(String[] args) {
        List<People> list = new LinkedList<People>();
        People tom = new People(78);
        list.add(tom);
        list.add(new People(58));
        list.add(new People(68));
        list.add(new People(38));
        People item = list.get(3);
        System.out.println(item.height);
        System.out.println(list.indexOf(tom));
        System.out.println(list.contains(new People(78)));//自动调用equals方法，需重写

    }
}
