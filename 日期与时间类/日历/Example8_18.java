package »’¿˙;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Example8_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		GiveCalendar giveCalendar = new GiveCalendar();
		LocalDate[]dataArrays = giveCalendar.getCalendar(date);
		NameHead.printNameHead(date);
		for(int i = 0;i < dataArrays.length;i++) {
			if(i == 0) {
				PrintSpace.printSpace(dataArrays[i].getDayOfWeek());
				System.out.printf("%4d", dataArrays[i].getDayOfMonth());
			}
			else {
				System.out.printf("%4d", dataArrays[i].getDayOfMonth());
			}
			if(dataArrays[i].getDayOfWeek() == DayOfWeek.SATURDAY)
				System.out.println();
		}
		

	}
	
	

}
