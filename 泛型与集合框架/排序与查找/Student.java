package ���������;

public class Student implements Comparable<Student>{
    int height;
    int weight;
    String name;
    Student(String n,int h,int w){
        name = n;
        height = h;
        weight = w;
    }
    public int compareTo(Student st){//��дcompareTo����
        return (this.height - st.height);
    }
}
