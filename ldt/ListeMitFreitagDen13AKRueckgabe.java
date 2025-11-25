package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListeMitFreitagDen13AKRueckgabe {

	public static void main(String[] args) {
		LocalDate startDatum = LocalDate.of(1800, 1, 1);
		LocalDate heute = LocalDate.now();
		
		ArrayList <LocalDate> daten = new ArrayList<LocalDate>();
		
		
		System.out.println("Im Zeitraum vom "+startDatum+" bis "+heute+" gab es "+datumsListe(startDatum, heute, daten)+" Freitage die am 13. waren");
		
		for (LocalDate date : daten) {
			System.out.println(date);
		}
		
	}
	static int datumsListe(LocalDate start, LocalDate ende, ArrayList<LocalDate> daten){
		int count = 0;
		LocalDate temp = (start.getDayOfMonth() > 13)? LocalDate.of(start.getYear(), start.getMonthValue(), 13).plusMonths(1)
			:LocalDate.of(start.getYear(), start.getMonthValue(), 13);
		
				
		while(!temp.isAfter(ende)) {
			if(temp.getDayOfMonth() == 13 & temp.getDayOfWeek() == DayOfWeek.FRIDAY) {
				daten.add(temp);
				count++;
				temp = temp.plusMonths(1);
			}else
				temp = temp.plusMonths(1);
		}
		return count;
		
	}
}
 
 