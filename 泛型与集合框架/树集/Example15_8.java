package ����;

import java.util.Iterator;
import java.util.TreeSet;


//�������ڲ��������


public class Example15_8 {
    public static void main(String[] args) {
        TreeSet<Student> mytree = new TreeSet<Student>();

        Student st1;
        Student st2;
        Student st3;
        Student st4;

        st1 = new Student(90,"��һ");
        st2 = new Student(66,"ǰ��");
        st3 = new Student(86,"����");
        st4 = new Student(76,"����");

        mytree.add(st1);//ֱ����add���룬ʹ��Student���е�compare�����Ƚ�
        mytree.add(st2);
        mytree.add(st3);
        mytree.add(st4);

        Iterator<Student>iter = mytree.iterator();//��������ĵ�����


        while(iter.hasNext()){
            Student stu = iter.next();
            System.out.println(stu.name + " " + stu.english);
        }
    }
}
