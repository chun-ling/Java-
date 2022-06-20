package 遍历列表;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example15_3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();//LinkedList链表需要从头开始找
        for (int i = 0;i <= 60096;i++){//链式表利于删除，不利于查找
            list.add("speed" + i);
        }
        Iterator<String> iter = list.iterator();//链表的迭代器
        long startTime = System.nanoTime();
        while(iter.hasNext()){//迭代器的方法
            String s = iter.next();
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("迭代器所用时间：" + estimatedTime + "纳秒");


        startTime = System.nanoTime();
        for(int i = 0;i < list.size();i++){
            String s = list.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("get方法所用时间" + estimatedTime + "纳秒");


        List<String> arrayList = new ArrayList<String>();//顺序表
        for (int i = 0;i <= 60096;i++){//顺序表利于查找，不利于删除
            arrayList.add("speed" + i);
        }
        startTime = System.nanoTime();
        for (int i = 0;i < arrayList.size();i++){
            String s = arrayList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("顺序表ArrayList使用get方法所用时间:" + estimatedTime + "纳秒");
    }
}
