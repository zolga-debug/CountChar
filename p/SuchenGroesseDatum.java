package p;

import java.io.File;
import java.time.LocalDate;

public class SuchenGroesseDatum {

	static int anzahlDateien = 0;

	public static void main(String[] args) {
		File f = new File("C:\\");
		/* File */ f = new File("G:\\P\\ws_jee2025_03\\J_2506"); // Verzeichnis
//		f = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");

//		Übung: Bitte erlauben Sie die Angabe eines Datumsbereichs (von bis)
		1315
		LocalDate startDatum = LocalDate.of(2019, 11, 15);
		LocalDate endeDatum = LocalDate.of(2025, 9, 3); 

		dirNameGroesse(f, startDatum, endeDatum);
		
//		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Dateien vorhanden, die zwischen "
//				+ laengeMin + " und " + laengeMax + " lang sind");
	}

	static void dirNameGroesse(File dir, LocalDate startDatum, LocalDate endeDatum) { //
		File[] fa = dir.listFiles();
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dirNameGroesse(e, laengeMin, laengeMax);
				} else { // also Datei
					tuwas(e, laengeMin, laengeMax);
				}
			}
		}
	}

	static void tuwas(File e, long laengeMin, long laengeMax) {
		if (e.length() >= laengeMin & e.length() <= laengeMax) {
			System.out.println("Datei: " + e + " " + e.length()+"\t"+e.lastModified()); // Ausgabe Dateiname inkl. Pfad und Dateilänge
			anzahlDateien++;
		}
	}
}
