package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ListeMitFreitagDen13 {

	public static void main(String[] args) {
		LocalDate startDatum = LocalDate.of(1800, 1, 1);
		LocalDate heute = LocalDate.now();
		
//		Übung: Bitte geben Sie die Daten untereinander aus, die Fratage an einem 13. sind.
		
		
//		Aufruf der M. zu Übung 3:
		ArrayList  <LocalDate> ergebnisListe = datumsListe("01.01.1900","26.08.2025");
//		Ausgabe in einer Schleife
		for (LocalDate date : ergebnisListe) {
			System.out.println("Freitag der 13: " + date);
		}
		
	}
	

// Übung 1: Bitte übergeben Sie nicht nur das Start- und Ende-Datum, sondern auch die Ergebnis-Arraylist.
// Rückgabetyp sei void.
// Übung 2: Rückgabetyp sei int, der die gefundenen Anzahl zurück gibt.
// Übung 3: 
//  Ziel: Üben von Überladung und Chaining (analog dem Constructor-Chaining) => s.a. Bremsen und Anhalten 
//  Methoden-Signatur sei static ArrayList <LocalDate> datumsListe(String start, String ende){

	static ArrayList <LocalDate> datumsListe(String start, String ende){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(start, formatter);	
        LocalDate endeDate = LocalDate.parse(ende, formatter);
        
		ArrayList<LocalDate> ergebnisListe = new ArrayList<>();
		
		while(!startDate.isAfter(endeDate)) {
			if(startDate.getDayOfMonth() == 13 & startDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
				ergebnisListe.add(startDate);
			}
			startDate = startDate.plusDays(1);
		}
		return ergebnisListe ;
	
		
	}
}




