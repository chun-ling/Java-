package ϴ������ת;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example15_5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 10;i <=50;i = i+10)
            list.add(i);
        System.out.println("ϴ��ǰ�������е����ݣ�");
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());

        }
        System.out.println();
        Collections.shuffle(list);//ϴ��
        System.out.println("ϴ�ƺ������е����ݣ�");
        iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());
        }
        System.out.println();
        System.out.println("������תһ�κ������е����ݣ�");
        Collections.rotate(list,1);//������ת
        iter = list.iterator();
        while(iter.hasNext()){
            Integer n = iter.next();
            System.out.printf("%d\t",n.intValue());
        }
    }
}
