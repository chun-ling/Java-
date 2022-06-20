package ���������;

import java.util.*;

public class Example15_4 {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("����",188,86));
        list.add(new Student("����",178,83));
        list.add(new Student("�Դ���",198,89));
        list.add(new Student("������",175,100));

        Iterator<Student> iter = list.iterator();
        System.out.println("����ǰ�������е����ݣ�");
        while(iter.hasNext()) {
            Student stu = iter.next();
            System.out.println(stu.name + "��ߣ�" + stu.height);
        }

            Collections.sort(list);//ʹ��sort����ʱ��Student������Ҫʵ��Comparable�ӿڣ�������дcompareTo����

            System.out.println("���򣨰���ߣ��������е����ݣ�");
            iter = list.iterator();
            while(iter.hasNext()){
                Student stu = iter.next();
                System.out.println(stu.name + "���" + stu.height);
            }

            Student zhaolin = new Student("����",178,100);
            int index = Collections.binarySearch(list,zhaolin,null);
            if(index >= 0){
                System.out.println(zhaolin.name + "�������е�" + list.get(index).name + "�����ͬ");
            }

        }



}
