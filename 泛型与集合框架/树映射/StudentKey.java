package Ê÷Ó³Éä;

import Ê÷¼¯.Student;

public class StudentKey implements Comparable<StudentKey>{
    double d;
    StudentKey(double d){
        this.d = d;
    }
    public int compareTo(StudentKey b){
        StudentKey st = b;
        if((this.d - st.d) == 0)
            return -1;
        else
            return (int)((this.d - st.d)*1000);
    }
}
