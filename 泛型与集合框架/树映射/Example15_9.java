package 树映射;
//既想排序又想查找


import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Example15_9 {
    public static void main(String[] args) {
        TreeMap<StudentKey,student> treeMap= new TreeMap<>();//树映射用前一个泛型排序
        String str[] = {"赵一","钱二","孙三","李四"};
        double math[] = {89,45,78,76};
        double english[] = {67,66,90,56};
        student student[] = new student[4];
        for(int k = 0;k < student.length;k++){
            student[k] = new student(str[k],math[k],english[k]);
        }
        StudentKey key[] = new StudentKey[4];
        for(int k = 0;k < key.length;k++){
            key[k] = new StudentKey(student[k].math);//初始化
        }

        for(int k = 0;k < student.length;k++){
            treeMap.put(key[k],student[k]);//映射用put方法，与add方法相区别，此时排序
        }

        int number = treeMap.size();
        System.out.println("树映射中有" + number + "个对象，按数学成绩排序：");
        Collection collection = treeMap.values();
        Iterator iter = collection.iterator();

        while(iter.hasNext()){
            student stu = (student) iter.next();
            //System.out.println(iter.next());
            System.out.println(stu.name + "的数学成绩：" + stu.math);
        }

    }
}
