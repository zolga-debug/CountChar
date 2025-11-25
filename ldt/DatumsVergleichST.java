package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatumsVergleichST {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2020, 03, 13);
		LocalDate date2 = LocalDate.of(2022, 03, 13);
		System.out.println(date1+ " " + (isFreitagDer13(date1) ? "ist Freitag der 13." : "ist nicht Freitag der 13."));
		System.out.println(date2+ " " + (isFreitagDer13(date2) ? "ist Freitag der 13." : "ist nicht Freitag der 13."));
	}
	
	static boolean isFreitagDer13(LocalDate date) {
		return date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY ;
	}
}