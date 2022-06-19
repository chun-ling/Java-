package 计算两时间间隔天数;

import java.util.Calendar;

public class Compute {

    public Compute(int[]a){
        Calendar calendar = Calendar.getInstance();
        calendar.set(a[0],a[1],a[2]);
        long s1 = calendar.getTimeInMillis();

        calendar.set(a[3],a[4],a[5]);
        long s2 = calendar.getTimeInMillis();

        long s3 = (Math.abs(s2 - s1)/(1000*60*60*24));

        System.out.println(s3);

    }
}
