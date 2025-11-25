package ldt;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Schaltjahr {

	public static void main(String[] args) {
//		Übung: Bitte ermitteln Sie, ob das Jahr 2020-03-13 ein Schaltjahr war.
//		Alle Ermittlungsmethoden sind erlaubt.
		System.out.println("=== CB ===");
		LocalDate startDatum = LocalDate.of(2000, 1, 1);
        LocalDate heute = LocalDate.of(2050, 1, 1);

		System.out.println("Ist " + startDatum + " ein Schaltjahr? " + (startDatum.isLeapYear() ? "Ja" : "Nein"));
		 
		System.out.println("=== AK ===");
//		LocalDate date = LocalDate.of(2020, 3, 13);
		System.out.println(startDatum.getYear()+ " " + (startDatum.isLeapYear()? "war ein Schaltjahr." : "war kein Schaltjahr"));
		
//		Übung: Bitte schreiben Sie eine M., die ein Start- und ein Endejahr (als LocalDate jeweils der erste Januar des Jahres (z.B. für 2020 den 1.1.2020)) nimmt.
//		Sie soll eine ArrayList (als LocalDate jeweils der erste Januar des Jahres (z.B. für 2020 den 1.1.2020)) zurückgeben, die die Jahreszahlen der Schaltjahre zurück gibt.
		// Список високосних років
        ArrayList<LocalDate> schaltjahre = datumsListe(startDatum, heute);
        System.out.println("Schaltjahre von " + startDatum.getYear() + " bis " + heute.getYear() + ":");
        for (LocalDate d : schaltjahre) {
            System.out.println(d);
        }
        int anzahl = zaehle(startDatum, heute);

        System.out.println("Anzahl der Schaltjahren zwischen " + startDatum + " und " + heute + ": " + anzahl);
    }
			
		
	
	static ArrayList<LocalDate> datumsListe(LocalDate start, LocalDate ende){
        ArrayList<LocalDate> leapYears = new ArrayList<>();
        for (int year = start.getYear(); year <= ende.getYear(); year++) {
            if (Year.isLeap(year)) {
                LocalDate firstDayOfLeapYear = LocalDate.of(year, 1, 1);
                leapYears.add(firstDayOfLeapYear);
            }
        }

        return leapYears;
    }
    static int zaehle(LocalDate start, LocalDate ende){
     int count = 0;
        ArrayList<LocalDate> leapYears = new ArrayList<>();
        for (int year = start.getYear(); year <= ende.getYear(); year++) {
            if (Year.isLeap(year)) {
                LocalDate firstDayOfLeapYear = LocalDate.of(year, 1, 1);
                count++;
            }
        }

        return count;
    }
}

