package 计算两时间间隔天数;

public class ComputeTest {
    public static void main(String args[]){
        int[]a = new int[6];


        a[0] = Integer.parseInt(args[0]);
        a[1] = Integer.parseInt(args[1]);
        a[2] = Integer.parseInt(args[2]);

        a[3] = Integer.parseInt(args[3]);
        a[4] = Integer.parseInt(args[4]);
        a[5] = Integer.parseInt(args[5]);

        new Compute(a);




    }

}
