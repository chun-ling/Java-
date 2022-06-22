package 树集;

public class Student implements Comparable<Student>{
//区分equals方法和compareTo方法的重写
    //不告诉树集大小，则没法排；怎么比呀
    String name;
    int english;
    Student(int english,String name){
        this.name = name;
        this.english = english;
    }
    public int compareTo(Student b){
        return this.english - b.english;
    }
}
