package ������ʱ����;

//��LocalDate����ȣ�LocalDateTime���ܷ�װʱ���֡��롢���룺


import java.time.LocalDateTime;

public class LocalDateTime���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date = LocalDateTime.now();
		int a = date.getYear();
		int b = date.getMonthValue();
		int c = date.getDayOfYear();
		int d = date.getHour();//��õ�ǰʱ���Сʱ
		int e = date.getMinute();//����
		int f = date.getSecond();//��
		int g = date.getNano();//����
		System.out.println(date + "\n" + a + "\n" + b + "\n" + c + "\n" + d  + "\n" + e);
		System.out.println(f + "\n" + g);

	}

}

