package ldt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatierPattern {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021,1,15);
		/*LocalDate*/ date = LocalDate.of(2021,1,02);
		LocalTime time = LocalTime.of(13,39); // 
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d YYYY, hh:mm");
		System.out.println(dateTime.format(dtf)); // Januar 2 2021, 01:39
		/*DateTimeFormatter*/ dtf = DateTimeFormatter.ofPattern("MMMM dd YYYY, hh:mm");
		System.out.println(dateTime.format(dtf)); // Januar 02 2021, 01:39
		
		String dateTimeFormatierung = "dd. MMM";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 02. Jan
		
		/*String*/ dateTimeFormatierung = "dd. MM";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 02. 01
		
		/*String*/ dateTimeFormatierung = "dd. MM.";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 02. 01.
		
		/*String*/ dateTimeFormatierung = "dd.MM.YY";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 02.01.20
		
		/*String*/ dateTimeFormatierung = "dd.MM.YYY";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // 02.01.2020
		
		/*String*/ dateTimeFormatierung = "MMMM dd YYYY, hh:MM";
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // Januar 02 2020, 01:01 => Januar für Minute
		
		/*String*/ dateTimeFormatierung = "MMMM dd YYYY, kk:mm"; // k       clock-hour-of-am-pm (1-24) aus der KlassenBeschreibung (API)
		dtf = DateTimeFormatter.ofPattern(dateTimeFormatierung);
		System.out.println(dateTime.format(dtf)); // Januar 02 2020, 13:39
	}

}
