package p;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class SuchenGroesse {

	static int anzahlDateien = 0;

	public static void main(String[] args) {
		File f = new File("C:\\");
		/* File */ f = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src"); // Verzeichnis
		
//		Übung: Bitte erlauben Sie die Angabe eines Größenbereichs (von bis)
//		long laengeMin=1_000;
//		long laengeMax=5_000;
	
		LocalDate startDatum = LocalDate.of(2025, 8, 10);
		LocalDateTime ldt_start = LocalDateTime.of(startDatum, LocalTime.MIDNIGHT);
		ZoneId zeitZone = ZoneId.of("Europe/Berlin");
		System.out.println(ldt_start.atZone(zeitZone).toInstant()); 
		
		LocalDate endeDatum = LocalDate.of(2025, 9, 19); 
		LocalDateTime ldt_end = LocalDateTime.of(endeDatum, LocalTime.MIDNIGHT);
		
//		System.out.println(ldt_start.atZone(zeitZone).toInstant());
//		System.out.println(ldt_end.atZone(zeitZone).toInstant());
		
		dirNameGroesse(f,startDatum, endeDatum );
//		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Dateien vorhanden, die zwischen "
//				+ laengeMin + " und " + laengeMax + " lang sind");
	}
	static void dirNameGroesse(File dir,LocalDate startDatum, LocalDate endeDatum  ) { //
		File[] fa = dir.listFiles();
        if (fa != null) {
            for (File e : fa) {
                if (e.isDirectory()) {
                    dirNameGroesse(e, startDatum, endeDatum );
                } else {
                    tuwas(e, startDatum, endeDatum );
				}
			}
		} 
	}

//	static void tuwas(File e, long laengeMin, long laengeMax, LocalDate startDatum, LocalDate endeDatum) {
//        long size = e.length(); // Größe in Bytes
//        if (size >= laengeMin && size <= laengeMax && e.getName().endsWith(".java")) {
//            System.out.println("Datei: " + e.getName() +
//                               " | Pfad: " + e.getAbsolutePath() +
//                               " | Größe: " + size + " Bytes");
//            anzahlDateien++;
static void tuwas(File e, LocalDate startDatum, LocalDate endeDatum) {
		
		if (e.lastModified() >= LocalDateTime.of(startDatum,LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()&&
				e.lastModified() <= LocalDateTime.of(endeDatum,LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) {
			System.out.println("Datei: " + e + "\t"
				+LocalDateTime.ofInstant(Instant.ofEpochMilli(e.lastModified()) , ZoneId.systemDefault()).toLocalDate());
			anzahlDateien++;
		}
	}
}
 
            
