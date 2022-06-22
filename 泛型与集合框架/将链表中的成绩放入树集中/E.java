package 将链表中的成绩放入树集中;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class E {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        String name[] = {"张三","李四","王五","老刘","薛七","王八"};
        double score[] = {99,22,33,44,55,66};
        int k = 0;

//        while(k < student.length){
//            student[k] = new Student(name[k],score[k]);
//            k++;
//        }


        while(k < score.length){
            list.add(new Student(name[k],score[k]));
            k++;
        }

        Iterator<Student>iter = list.iterator();

        TreeSet<Student> treeSet = new TreeSet<>();
        while (iter.hasNext()) {
            treeSet.add(iter.next());
        }

        Iterator<Student>iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.name + "成绩：" + s.score);
        }
    }
}
