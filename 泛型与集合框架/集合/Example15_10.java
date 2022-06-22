package 集合;

import java.util.HashSet;
import java.util.Iterator;

public class Example15_10 {
    public static void main(String[] args) {
        Student zh = new Student("张三",76);
        Student wa = new Student("王二",88);
        Student li = new Student("李四",97);
        HashSet<Student> set = new HashSet<>();//集合类
        HashSet<Student> subset = new HashSet<>();
        set.add(zh);//使用add方法加入
        set.add(wa);
        set.add(li);
        subset.add(wa);
        subset.add(li);


        if(set.contains(wa)){//如果集合中包含某个元素
            System.out.println("集合set中含有：" + wa.name);
        }
        if(set.containsAll(subset)){//如果一个集合包含另一个集合
            System.out.println("集合set包含集合subset");
        }

        int number = subset.size();
        System.out.println("集合subset中含有" + number + "个元素");

        Iterator<Student>iter = subset.iterator();
        while (iter.hasNext()) {
            Student te = iter.next();
            System.out.println("姓名：" + te.name + ",分数：" + te.score);
        }
    }
}
