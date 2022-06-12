package 日期与时间类;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDate方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datenow = LocalDate.now();
		LocalDate dateother = LocalDate.of(2003,3,27);
		int a = datenow.getDayOfMonth();//今天是本月的第几天
		int b = datenow.getMonthValue();//几月
		Month c = datenow.getMonth();//本月的英文表示
		int d = datenow.getDayOfYear();//今天是本年的第几天
		DayOfWeek e = datenow.getDayOfWeek();//今天周几的英文
		int f = datenow.getYear();//今年是第几年
		int g = datenow.lengthOfYear();//今年有几天
		int h = datenow.lengthOfMonth();//这个月有几天
		boolean i = datenow.isLeapYear();//是否为闰年
		datenow = datenow.plusMonths(-1);//把当前日期往前提一个月
		int j = datenow.compareTo(dateother);//当前日期与参数日期相比较，返回年数或月数或日数
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
		System.out.println(g + "\n" + h + "\n" + i + "\n" + datenow + "\n" + j);
		
		
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh-mm-ss");
		System.out.println(sdf.format(now));
	}

}
