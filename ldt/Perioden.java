package ldt;

import java.time.LocalDate;
import java.time.Period;

public class Perioden {

	public static void main(String[] args) {
		LocalDate originalDatum = LocalDate.of(2019, 4, 13); // line 1
		LocalDate datum = originalDatum; // line 2
		System.out.println(datum);
		
		Period annualy = /*new*/ Period/*()*/.ofYears(1); 
		System.out.println(annualy); // P1Y
		
//	    @Override
//	    public String toString() {
//	        if (this == ZERO) {
//	            return "P0D";
//	        } else {
//	            StringBuilder buf = new StringBuilder();
//	            buf.append('P');
//	            if (years != 0) {
//	                buf.append(years).append('Y');
//	            }
//	            if (months != 0) {
//	                buf.append(months).append('M');
//	            }
//	            if (days != 0) {
//	                buf.append(days).append('D');
//	            }
//	            return buf.toString();
//	        }
//	    }
		
		Period quarterly = Period.ofMonths(3);
		System.out.println("quartalsweise: "+quarterly); // Übung: was wird angezeigt
		
		Period every3Weeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndWeek = Period.of(1, 0, 7);
		
		System.out.println(datum);// 2019-04-13
		datum = datum.plus(everyYearAndWeek);
		System.out.println(datum);// 2020-04-20+(1Y 7D)
		
		datum = originalDatum;
		System.out.println(datum);// 2019-04-13
		Period w = Period.ofYears(1).ofWeeks(1); // The static method ofWeeks(int) from the type Period should be accessed in a static way
		datum = datum.plus(w);
		System.out.println(datum);// 2019-04-20 wg. Chaining-Problem
		
//		warum? Darum:
		datum = originalDatum;
		w = Period.ofYears(1);
		w = Period.ofWeeks(1); // vor Assignment Becher ausgekippt
		datum = datum.plus(w);
		System.out.println(datum);// 2019-04-20 wg. Chaining-Problem
		
//		Equality
		LocalDate date1 = LocalDate.of(2_019, 0x7, 19);
		LocalDate date2 = LocalDate.of(2_019, 0b111, 19);
		System.out.println(date1 == date2); // ==
		System.out.println(date1.equals(date2)); // überschrieben
		
	} //Eom

}
