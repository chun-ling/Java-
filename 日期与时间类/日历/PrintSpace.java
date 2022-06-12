package ÈÕÀú;

import java.time.DayOfWeek;

public class PrintSpace {
	public static void printSpace(int n) {
		for(int i = 0;i < n;i++){
			System.out.printf("%4s","");
		}
	}
	public static void printSpace(DayOfWeek x) {
		switch(x) {
		case SUNDAY:printSpace(0);break;
		case MONDAY:printSpace(1);break;
		case TUESDAY:printSpace(2);break;
		case WEDNESDAY:printSpace(3);break;
		case THURSDAY:printSpace(4);break;
		case FRIDAY:printSpace(5);break;
		case SATURDAY:printSpace(6);break;
		}
	}

}
