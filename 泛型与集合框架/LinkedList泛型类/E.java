package LinkedList������;

import com.sun.source.tree.UsesTree;

import java.util.LinkedList;

public class E {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<String>();
        s.add("how");
        s.add("are");
        s.add("you");
        s.add("java");
        String s1 = s.get(3);
        System.out.println(s1);

        String jerry = new String("are");
        System.out.println(s.indexOf(jerry));
        System.out.println(s.indexOf("how"));//��û�з�װ��ͬ�Ķ��󣬷�������
        System.out.println(s.contains("java"));//��û�а����ö���
    }
}
