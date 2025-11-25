package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListeMitFreitagDen13AKparameter {

	public static void main(String[] args) {
		LocalDate startDatum = LocalDate.of(1800, 1, 1);
		LocalDate heute = LocalDate.now();
		
		ArrayList <LocalDate> daten = new ArrayList<LocalDate>();
		
		datumsListe(startDatum, heute, daten);
		
		for (LocalDate date : daten) {
			System.out.println(date);
		}
		
	}
	static void datumsListe(LocalDate start, LocalDate ende, ArrayList<LocalDate> daten){
		
		LocalDate temp;
	
		if(start.getDayOfMonth() > 13) {
			temp = LocalDate.of(start.getYear(), start.getMonthValue()+1, 13);
		}else {
			temp = LocalDate.of(start.getYear(), start.getMonthValue(), 13);
		}
		
		while(!temp.isAfter(ende)) {
			if(temp.getDayOfMonth() == 13 & temp.getDayOfWeek() == DayOfWeek.FRIDAY) {
				daten.add(temp);
				temp = temp.plusMonths(1);
			}else
				temp = temp.plusMonths(1);
		}
	}
}
 
 