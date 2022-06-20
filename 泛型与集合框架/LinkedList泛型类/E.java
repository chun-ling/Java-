package LinkedList泛型类;

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
        System.out.println(s.indexOf("how"));//有没有封装相同的对象，返回索引
        System.out.println(s.contains("java"));//有没有包含该对象
    }
}
