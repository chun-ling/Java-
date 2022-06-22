package 树集;

import java.util.Iterator;
import java.util.TreeSet;


//树集便于插入和排列


public class Example15_8 {
    public static void main(String[] args) {
        TreeSet<Student> mytree = new TreeSet<Student>();

        Student st1;
        Student st2;
        Student st3;
        Student st4;

        st1 = new Student(90,"赵一");
        st2 = new Student(66,"前二");
        st3 = new Student(86,"孙三");
        st4 = new Student(76,"李四");

        mytree.add(st1);//直接用add加入，使用Student类中的compare方法比较
        mytree.add(st2);
        mytree.add(st3);
        mytree.add(st4);

        Iterator<Student>iter = mytree.iterator();//获得树集的迭代器


        while(iter.hasNext()){
            Student stu = iter.next();
            System.out.println(stu.name + " " + stu.english);
        }
    }
}
