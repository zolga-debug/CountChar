package ldt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListeMitFreitagDen13Chain {
	
//	nächste Übung:
//	Bitte stellen Sie sicher, das versch. Strings mit länderspez. Datumsformaten funktionieren.
//	Verwenden Sie dazu die Unterscheidung mittels zusätzlichem String-Parameter.
//	Als Argumente dienen DE f. Deutsch, AE f. Amerikanisches Englisch (AE) und BE f. Britisches Englisch (BE)
	
	public static void main(String[] args) {
		ArrayList<LocalDate> listeDE = datumsListe("01.01.2021", "26.08.2025", "DE");
        ArrayList<LocalDate> listeAE = datumsListe("08/13/2021", "08/26/2025", "AE");
        ArrayList<LocalDate> listeBE = datumsListe("13/08/2021", "26/08/2025", "BE");

        System.out.println("Deutsch:");
        for (LocalDate d : listeDE) {
            System.out.println(d);
        }

       System.out.println("\nAmerikanisch:");
        for (LocalDate d : listeAE) {
         System.out.println(d);
       }

        System.out.println("\nBritisch:");
        for (LocalDate d : listeBE) {
            System.out.println(d);
        }

	  }

static ArrayList<LocalDate> datumsListe(String start, String ende, String formatCode) {
    LocalDate startDate = parseDate(start, formatCode);
    LocalDate endeDate = parseDate(ende, formatCode);
    return datumsListe(startDate, endeDate);
}

// Parser ohne Formatter
static LocalDate parseDate(String s, String formatCode) {
    int tag =0;
    int monat=0;
    int jahr=0;
    String[] teile;

    switch (formatCode) {
        case "DE": // dd.MM.yyyy
            teile = s.split("\\.");
            tag = Integer.parseInt(teile[0]);
            monat = Integer.parseInt(teile[1]);
            jahr = Integer.parseInt(teile[2]);
            break;

        case "AE": // MM/dd/yyyy
            teile = s.split("/");
            monat = Integer.parseInt(teile[0]);
            tag = Integer.parseInt(teile[1]);
            jahr = Integer.parseInt(teile[2]);
            break;

        case "BE": // dd/MM/yyyy
            teile = s.split("/");
            tag = Integer.parseInt(teile[0]);
            monat = Integer.parseInt(teile[1]);
            jahr = Integer.parseInt(teile[2]);
            break;

        default:
            throw new IllegalArgumentException("Unbekannter FormatCode: " + formatCode);
    }

    return LocalDate.of(jahr, monat, tag);
}

static ArrayList<LocalDate> datumsListe(LocalDate startDate, LocalDate endeDate) {
    ArrayList<LocalDate> ergebnisListe = new ArrayList<>();
    while (!startDate.isAfter(endeDate)) {
        if (startDate.getDayOfMonth() == 13 && startDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
            ergebnisListe.add(startDate);
        }
        startDate = startDate.plusDays(1);
    }
    return ergebnisListe;
}
}