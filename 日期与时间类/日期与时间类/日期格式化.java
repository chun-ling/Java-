package 日期与时间类;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class 日期格式化 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime nowTime = LocalDateTime.now();
		String pattern = "%tY-%<tm-%<td,%<tA,%<tT";
		String s = String.format( pattern, nowTime);
		System.out.println(s);
		s = String.format(Locale.US, pattern, nowTime);
		System.out.println(s);
		s = String.format(Locale.JAPAN, pattern, nowTime);
		System.out.println(s);
		
		
		
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh-mm-ss");
		System.out.println(sdf.format(now));

	}

}
