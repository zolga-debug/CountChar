package ldt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PlusMinus {

	public static void main(String[] args) {
		LocalDate datum = LocalDate.of(2019, 6, 1);
		System.out.println(datum);
		
		LocalTime zeit = LocalTime.of(11, 13);
		zeit.plusMinutes(1);
		System.out.println(zeit); // 11:13
		
		String s = "Hallo";
		s.concat(" Welt");
		System.out.println(s); // Hallo
		
		zeit = zeit.plusMinutes(1);
		System.out.println(zeit); // 11:14
		
		datum.plusDays(30); // Rechnungsdatum mit Zahlungsziel 30 Tage
		System.out.println(datum); // 2019-06-01
		
		LocalDateTime ldt = LocalDateTime.of(2021, Month.JANUARY,15,11,19);
		System.out.println(ldt);
		ldt = ldt.plusHours(1);
		ldt=ldt.plusDays(30);
		System.out.println(ldt);
		ldt=ldt.minusWeeks(10);
		System.out.println(ldt);
	}

}
