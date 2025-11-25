package p;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class SuchenGroesseDatumAK {

	static int anzahlDateien = 0;

	public static void main(String[] args) {
		File f = new File("C:\\");
		/* File */ f = new File("G:\\P\\ws_jee2025_03\\J_2506"); // Verzeichnis
//		f = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");

//		Übung: Bitte erlauben Sie die Angabe eines Datumsbereichs (von bis)
		LocalDate startDatum = LocalDate.of(2025, /*0*/9, 03);
		LocalDate endeDatum = LocalDate.of(2025, 9, 10);

		dirNameGroesse(f, startDatum, endeDatum);

//		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Dateien vorhanden, die zwischen "
//				+ laengeMin + " und " + laengeMax + " lang sind");
	}

	static void dirNameGroesse(File dir, LocalDate startDatum, LocalDate endeDatum) { //
		File[] fa = dir.listFiles();
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dirNameGroesse(e, startDatum, endeDatum);
				} else { // also Datei
					tuwas(e, startDatum, endeDatum);
				}
			}
		}
	}

	static void tuwas(File e, LocalDate startDatum, LocalDate endeDatum) {
//@formatter:off
		if (e.lastModified() >= LocalDateTime
				.of(startDatum, LocalTime.MIN)
				.atZone(ZoneId.systemDefault())
				.toInstant()
				.toEpochMilli()
				&&
				e.lastModified() <= LocalDateTime
				.of(endeDatum, LocalTime.MAX)
				.atZone(ZoneId
				.systemDefault())
				.toInstant()
				.toEpochMilli()) {
			
			System.out.println("Datei: " + e + "\t" + LocalDateTime
					.ofInstant(Instant
					.ofEpochMilli(e.lastModified()), ZoneId.systemDefault())
					.toLocalDate());
//@formatter:on
			anzahlDateien++;
		}
	}
}
