package 使用堆栈输出一个数列;

import java.util.Stack;

public class E {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.push(3);
        stack.push(8);

        int i = 1;
        while(i <= 10) {
            int d1 = stack.pop();
            int d2 = stack.pop();

            int d3 = 2*d1 + 2*d2;
            System.out.println(d3);

            stack.push(d1);
            stack.push(d3);

            i++;
        }

    }
}
