package ldt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatierParsen {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021,1,15);
		/*LocalDate*/ date = LocalDate.of(2021,1,02);
		LocalTime time = LocalTime.of(13,39); // 
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		
		String dateTimeFormatierung = "MM dd yy";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 01 02 21
		
		LocalDate datum = LocalDate.parse("01 13 15", dtf);
//		Übung: Bitte schreiben Sie eine Anweisungszeile, die "Schaltjahr" oder "kein Schaltjahr" für das Objekt auf das datum zeigt i.d. Console ausgibt.
		System.out.println(datum + " " + (datum.isLeapYear()? "war ein Schaltjahr." : "war kein Schaltjahr"));//2015-01-13 war kein Schaltjahr
	}

}
