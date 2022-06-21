package 散列映射;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class E {
    public static void main(String[] args) {
        HashMap<Integer,String> hashtable = new HashMap<>();//尖括号里面放两个泛型
        hashtable.put(1,"java2实用教程第6版");//也称为键值对
        hashtable.put(2,"JSP实用教程第4版");//用put压入值
        hashtable.put(3,"java设计模式");
        hashtable.put(4,"java课程设计");

        System.out.println(hashtable.get(1));//用get获得值

        Collection<String> coll = hashtable.values();
        Iterator<String> iter = coll.iterator();//散列映射想获得迭代器，要用两步
        while(iter.hasNext()){
            String te = iter.next();
            System.out.println(te);
        }
    }
}
