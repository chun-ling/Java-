package �������еĳɼ�����������;

public class Student implements Comparable<Student>{
    String name;
    double score;

    Student(String name,double score){
        this.name = name;
        this.score = score;
    }

    public int compareTo(Student student){
        if(score != student.score)
            return (int)(score - student.score);
        else
            return 1;
    }
}
