package ������ʱ����;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class ���ڸ�ʽ�� {

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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��hh-mm-ss");
		System.out.println(sdf.format(now));

	}

}
