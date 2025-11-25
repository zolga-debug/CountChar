package p;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class UTC_ZeitZone_Instant {

	public static void main(String[] args) {
//		Datum und Zeit sind in Klasse File als UNIX-Zeit kodiert.
//		Für die Konvertierung zu EpochMilli, also UNIX-Zeit wird Instant (also UTC) mit Zeitzone benötigt.
		{
			LocalDate startDatum = LocalDate.of(2019, 11, 15);
			LocalDateTime ldt = LocalDateTime.of(startDatum, LocalTime.MIDNIGHT);
			System.out.println("Datum mit Mitternacht: " + ldt); // 2019-11-15T00:00
			ZoneId zeitZone = ZoneId.of("Europe/Berlin");
			System.out.println(ldt.atZone(zeitZone).toInstant()); // UTC: 2019-11-14T23:00:00Z
		}
		{
			LocalDate startDatum = LocalDate.of(2019, 11, 15);
			LocalDateTime ldt_start = LocalDateTime.of(startDatum, LocalTime.MIDNIGHT);
			System.out.println("Datum mit Mitternacht: " + ldt_start); // 2019-11-15T00:00
			ZoneId zeitZone = ZoneId.of("Europe/Berlin");
			System.out.println(ldt_start.atZone(zeitZone).toInstant()); // UTC: 2019-11-14T23:00:00Z
//			Übung: Bitte korrigieren Sie die Uhrzeit für unsere Zwecke um 1 h => +1h
			ldt_start =  ldt_start.plusHours(1);
			System.out.println(ldt_start.atZone(zeitZone).toInstant()); // UTC:2019-11-15T00:00:00Z
			System.out.println("Start (UNIX): " + ldt_start.atZone(zeitZone).toInstant().toEpochMilli()); // Start (UNIX): 1573776000000
			System.out.println("======= Ziel: Ende: 2025-05-03T23:59:59Z =============================");
			LocalDate endeDatum = LocalDate.of(2025, 5, 3); // Wunsch: ganzer Tag 3. Mai
			LocalDateTime ldt_end = LocalDateTime.of(endeDatum, LocalTime.MIDNIGHT);
			ldt_end = ldt_end.plusHours(25).plusMinutes(59).plusSeconds(59);
//			Übung: Korrektur vornehmen
			
			System.out.println("Ende-Datum mit MidNight: " + ldt_end);
			System.out.println(ldt_end.atZone(zeitZone).toInstant()); // falsche  UTC: 2025-05-02T22:00:00Z (vor Korrektur)
			System.out.println("Start (UNIX): " + ldt_end.atZone(zeitZone).toInstant().toEpochMilli()); // Start (UNIX): 1573776000000
			
		}

	}
}