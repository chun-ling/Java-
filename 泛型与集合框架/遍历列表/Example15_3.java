package �����б�;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example15_3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();//LinkedList������Ҫ��ͷ��ʼ��
        for (int i = 0;i <= 60096;i++){//��ʽ������ɾ���������ڲ���
            list.add("speed" + i);
        }
        Iterator<String> iter = list.iterator();//����ĵ�����
        long startTime = System.nanoTime();
        while(iter.hasNext()){//�������ķ���
            String s = iter.next();
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("����������ʱ�䣺" + estimatedTime + "����");


        startTime = System.nanoTime();
        for(int i = 0;i < list.size();i++){
            String s = list.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("get��������ʱ��" + estimatedTime + "����");


        List<String> arrayList = new ArrayList<String>();//˳���
        for (int i = 0;i <= 60096;i++){//˳������ڲ��ң�������ɾ��
            arrayList.add("speed" + i);
        }
        startTime = System.nanoTime();
        for (int i = 0;i < arrayList.size();i++){
            String s = arrayList.get(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("˳���ArrayListʹ��get��������ʱ��:" + estimatedTime + "����");
    }
}
