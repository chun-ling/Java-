package ����;

public class Student implements Comparable<Student>{
//����equals������compareTo��������д
    //������������С����û���ţ���ô��ѽ
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
