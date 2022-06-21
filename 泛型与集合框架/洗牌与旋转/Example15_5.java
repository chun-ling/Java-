package 洗牌与旋转;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example15_5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 10;i <=50;i = i+10)
            list.add(i);
        System.out.println("洗牌前，链表中的数据：");
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());

        }
        System.out.println();
        Collections.shuffle(list);//洗牌
        System.out.println("洗牌后，链表中的数据：");
        iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());
        }
        System.out.println();
        System.out.println("向右旋转一次后，链表中的数据：");
        Collections.rotate(list,1);//向右旋转
        iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());
        }
    }
}
