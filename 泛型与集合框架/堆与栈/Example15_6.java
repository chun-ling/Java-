package ����ջ;

import java.util.Stack;
//ջͨ��������Ҫ����ĳ���������������壬�������Թ�
public class Example15_6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();//���������治��д��������
        stack.push(1);
        stack.push(1);//ѹջ
        int k = 1;
        while(k <= 10){
            for(int i = 1;i <= 2;i++){
                int f1 = stack.pop();//��ջ
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
