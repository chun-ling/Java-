package ������ʱ����;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class LocalDate���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate datenow = LocalDate.now();
		LocalDate dateother = LocalDate.of(2003,3,27);
		int a = datenow.getDayOfMonth();//�����Ǳ��µĵڼ���
		int b = datenow.getMonthValue();//����
		Month c = datenow.getMonth();//���µ�Ӣ�ı�ʾ
		int d = datenow.getDayOfYear();//�����Ǳ���ĵڼ���
		DayOfWeek e = datenow.getDayOfWeek();//�����ܼ���Ӣ��
		int f = datenow.getYear();//�����ǵڼ���
		int g = datenow.lengthOfYear();//�����м���
		int h = datenow.lengthOfMonth();//������м���
		boolean i = datenow.isLeapYear();//�Ƿ�Ϊ����
		datenow = datenow.plusMonths(-1);//�ѵ�ǰ������ǰ��һ����
		int j = datenow.compareTo(dateother);//��ǰ���������������Ƚϣ���������������������
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
		System.out.println(g + "\n" + h + "\n" + i + "\n" + datenow + "\n" + j);
		
		
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��hh-mm-ss");
		System.out.println(sdf.format(now));
	}

}
