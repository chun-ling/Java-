package ��ӳ��;
//���������������


import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Example15_9 {
    public static void main(String[] args) {
        TreeMap<StudentKey,student> treeMap= new TreeMap<>();//��ӳ����ǰһ����������
        String str[] = {"��һ","Ǯ��","����","����"};
        double math[] = {89,45,78,76};
        double english[] = {67,66,90,56};
        student student[] = new student[4];
        for(int k = 0;k < student.length;k++){
            student[k] = new student(str[k],math[k],english[k]);
        }
        StudentKey key[] = new StudentKey[4];
        for(int k = 0;k < key.length;k++){
            key[k] = new StudentKey(student[k].math);//��ʼ��
        }

        for(int k = 0;k < student.length;k++){
            treeMap.put(key[k],student[k]);//ӳ����put��������add���������𣬴�ʱ����
        }

        int number = treeMap.size();
        System.out.println("��ӳ������" + number + "�����󣬰���ѧ�ɼ�����");
        Collection collection = treeMap.values();
        Iterator iter = collection.iterator();

        while(iter.hasNext()){
            student stu = (student) iter.next();
            //System.out.println(iter.next());
            System.out.println(stu.name + "����ѧ�ɼ���" + stu.math);
        }

    }
}
