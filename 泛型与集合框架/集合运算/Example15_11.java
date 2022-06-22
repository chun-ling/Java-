package 集合运算;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Example15_11 {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        for(int i = 1;i <= 4;i++){
            A.add(i);
        }

        B.add(1);
        B.add(2);
        B.add(5);
        B.add(6);

        HashSet<Integer> tempSet = (HashSet<Integer>) A.clone();
        A.removeAll(B);//差集
        B.removeAll(tempSet);
        B.addAll(A);

        int number = B.size();
        System.out.println("A与B的对称差集：");
        Iterator<Integer>iter = B.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
