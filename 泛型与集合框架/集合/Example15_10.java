package ����;

import java.util.HashSet;
import java.util.Iterator;

public class Example15_10 {
    public static void main(String[] args) {
        Student zh = new Student("����",76);
        Student wa = new Student("����",88);
        Student li = new Student("����",97);
        HashSet<Student> set = new HashSet<>();//������
        HashSet<Student> subset = new HashSet<>();
        set.add(zh);//ʹ��add��������
        set.add(wa);
        set.add(li);
        subset.add(wa);
        subset.add(li);


        if(set.contains(wa)){//��������а���ĳ��Ԫ��
            System.out.println("����set�к��У�" + wa.name);
        }
        if(set.containsAll(subset)){//���һ�����ϰ�����һ������
            System.out.println("����set��������subset");
        }

        int number = subset.size();
        System.out.println("����subset�к���" + number + "��Ԫ��");

        Iterator<Student>iter = subset.iterator();
        while (iter.hasNext()) {
            Student te = iter.next();
            System.out.println("������" + te.name + ",������" + te.score);
        }
    }
}
