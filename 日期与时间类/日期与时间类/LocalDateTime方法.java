package 日期与时间类;

//和LocalDate类相比，LocalDateTime类能封装时、分、秒、纳秒：


import java.time.LocalDateTime;

public class LocalDateTime方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
		int a = date.getYear();
		int b = date.getMonthValue();
		int c = date.getDayOfYear();
		int d = date.getHour();//获得当前时间的小时
		int e = date.getMinute();//分钟
		int f = date.getSecond();//秒
		int g = date.getNano();//纳秒
		System.out.println(date + "\n" + a + "\n" + b + "\n" + c + "\n" + d  + "\n" + e);
		System.out.println(f + "\n" + g);

	}

}

