package 时间差;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Example8_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateStart = LocalDateTime.of(1931, 9, 18, 0, 0, 0);
		LocalDateTime dateEnd = LocalDateTime.of(1945, 8, 15, 0, 0, 0);
		long years = dateStart.until(dateEnd, ChronoUnit.YEARS);
		long month = dateStart.until(dateEnd, ChronoUnit.MONTHS);
		long days = dateStart.until(dateEnd, ChronoUnit.DAYS);
		long hours = dateStart.until(dateEnd, ChronoUnit.HOURS);
		long weeks = dateStart.until(dateEnd, ChronoUnit.WEEKS);
		System.out.println(dateStart + "和" + dateEnd + "相差\n（分别按年、月、日、时和星期：）");
		System.out.println(years + "年（不足一年的零头按零计算）");
		System.out.println(month + "个月");
		System.out.println(days + "天");
		System.out.println(hours + "个小时");
		System.out.println(weeks + "个星期");
		
		
		LocalDateTime nextDateStart = dateStart.plusYears(years);
		month = nextDateStart.until(dateEnd, ChronoUnit.MONTHS);
		nextDateStart = nextDateStart.plusMonths(month);
		days = nextDateStart.until(dateEnd, ChronoUnit.DAYS);
		System.out.println(dateStart + "和" + dateEnd + "相差：");
		System.out.println(years + "年、" + month + "个月、" + days + "天。");
		
		
		
	}

}
