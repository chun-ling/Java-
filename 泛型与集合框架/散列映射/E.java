package ɢ��ӳ��;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class E {
    public static void main(String[] args) {
        HashMap<Integer,String> hashtable = new HashMap<>();//�������������������
        hashtable.put(1,"java2ʵ�ý̵̳�6��");//Ҳ��Ϊ��ֵ��
        hashtable.put(2,"JSPʵ�ý̵̳�4��");//��putѹ��ֵ
        hashtable.put(3,"java���ģʽ");
        hashtable.put(4,"java�γ����");

        System.out.println(hashtable.get(1));//��get���ֵ

        Collection<String> coll = hashtable.values();
        Iterator<String> iter = coll.iterator();//ɢ��ӳ�����õ�������Ҫ������
        while(iter.hasNext()){
            String te = iter.next();
            System.out.println(te);
        }
    }
}
