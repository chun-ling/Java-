package 排序与查找;

import java.util.*;

public class Example15_4 {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("张三",188,86));
        list.add(new Student("李四",178,83));
        list.add(new Student("赵大龙",198,89));
        list.add(new Student("李云龙",175,100));

        Iterator<Student> iter = list.iterator();
        System.out.println("排序前，链表中的数据：");
        while(iter.hasNext()) {
            Student stu = iter.next();
            System.out.println(stu.name + "身高：" + stu.height);
        }

            Collections.sort(list);//使用sort方法时，Student类中需要实现Comparable接口，并且重写compareTo方法

            System.out.println("排序（按身高）后，链表中的数据：");
            iter = list.iterator();
            while(iter.hasNext()){
                Student stu = iter.next();
                System.out.println(stu.name + "身高" + stu.height);
            }

            Student zhaolin = new Student("赵琳",178,100);
            int index = Collections.binarySearch(list,zhaolin,null);
            if(index >= 0){
                System.out.println(zhaolin.name + "和链表中的" + list.get(index).name + "身高相同");
            }

        }



}
