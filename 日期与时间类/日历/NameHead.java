package ����;

import java.time.LocalDate;

public class NameHead {
	public static void printNameHead(LocalDate date) {
		System.out.println(date.getYear() + "��" + date.getMonthValue() + "��������");
		String name[] = {"��","һ","��","��","��","��","��"};
		for(int i = 0;i < name.length;i++) {
			System.out.printf("%3s", name[i]);
		}
		System.out.println();
	}

}
