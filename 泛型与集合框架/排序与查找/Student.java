package 排序与查找;

public class Student implements Comparable<Student>{
    int height;
    int weight;
    String name;
    Student(String n,int h,int w){
        name = n;
        height = h;
        weight = w;
    }
    public int compareTo(Student st){//重写compareTo方法
        return (this.height - st.height);
    }
}
