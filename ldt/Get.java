package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Get {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 03, 13); // oktal
		System.out.println(date.getDayOfMonth()); // 13
		System.out.println(date.getDayOfWeek()); // FRIDAY
		System.out.println(date.getDayOfYear()); // 73
		System.out.println(date.getMonthValue()); // 3
		System.out.println(date.getMonth()); // MARCH
		System.out.println(date.getYear()); // 2020
	
		 System.out.println(isFreitagDer13(date));
//		Übung: Bitte schreiben Sie eine Methdoe isFreitagDer13().
//		Sie soll ein LocalDate-Obj. nehmen und ein boolean zurück geben.
	} 
		public static boolean isFreitagDer13(LocalDate a) {
			return a.getDayOfMonth() == 13 && a.getDayOfWeek() == DayOfWeek.FRIDAY;
		}
	
}

