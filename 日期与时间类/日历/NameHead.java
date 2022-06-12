package 日历;

import java.time.LocalDate;

public class NameHead {
	public static void printNameHead(LocalDate date) {
		System.out.println(date.getYear() + "年" + date.getMonthValue() + "月日历：");
		String name[] = {"日","一","二","三","四","五","六"};
		for(int i = 0;i < name.length;i++) {
			System.out.printf("%3s", name[i]);
		}
		System.out.println();
	}

}
