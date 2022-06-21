package 堆与栈;

import java.util.Stack;
//栈通常用于需要记忆的场景，比如象棋悔棋，老鼠走迷宫
public class Example15_6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();//尖括号里面不能写基本类型
        stack.push(1);
        stack.push(1);//压栈
        int k = 1;
        while(k <= 10){
            for(int i = 1;i <= 2;i++){
                int f1 = stack.pop();//弹栈
                int f2 = stack.pop();
                int temp = f1 + f2;
                System.out.println(temp);
                stack.push(temp);
                stack.push(f2);
                k++;
            }
        }
    }
}
