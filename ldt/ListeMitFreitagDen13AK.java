package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListeMitFreitagDen13AK {

	public static void main(String[] args) {
		LocalDate startDatum = LocalDate.of(1800, 1, 1);
		LocalDate heute = LocalDate.now();
		
		ArrayList<LocalDate> daten = datumsListe(startDatum, heute);
		
		for (LocalDate date : daten) {
			System.out.println(date);
		}
		
	}
	static ArrayList <LocalDate> datumsListe(LocalDate start, LocalDate ende){
		
		ArrayList<LocalDate> daten = new ArrayList<>();
		
		while(!start.isAfter(ende)) {
			if(start.getDayOfMonth() == 13 & start.getDayOfWeek() == DayOfWeek.FRIDAY) {
				daten.add(start);
			}
			start = start.plusDays(1);
		}
		return daten;
		
	}
}
 
 