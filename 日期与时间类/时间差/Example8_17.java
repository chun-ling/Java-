package ʱ���;

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
		System.out.println(dateStart + "��" + dateEnd + "���\n���ֱ��ꡢ�¡��ա�ʱ�����ڣ���");
		System.out.println(years + "�꣨����һ�����ͷ������㣩");
		System.out.println(month + "����");
		System.out.println(days + "��");
		System.out.println(hours + "��Сʱ");
		System.out.println(weeks + "������");
		
		
		LocalDateTime nextDateStart = dateStart.plusYears(years);
		month = nextDateStart.until(dateEnd, ChronoUnit.MONTHS);
		nextDateStart = nextDateStart.plusMonths(month);
		days = nextDateStart.until(dateEnd, ChronoUnit.DAYS);
		System.out.println(dateStart + "��" + dateEnd + "��");
		System.out.println(years + "�ꡢ" + month + "���¡�" + days + "�졣");
		
		
		
	}

}
