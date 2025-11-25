package p;

import java.io.File;
import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class AllesFindenPredicateFileSplit {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\User\\eclipse-workspace"); // Verzeichnis
//		dir = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");
		
//		Übung: Hier sind 2 String-Fragmente des Dateinamens bzw. Pfades filterbar.
//		Bitte ermöglichen Sie die Suche nach "beliebig" vielen Fragmenten -  1.000 oder 1.000.000, die nicht von uns ausgetestet werden.
//		Tipp: Split-Lösung aus unserem Projekt in einen Predicate-Block kopieren und mit dem übrigen logischen Ausdruck verknüpfen. 
		
		List<String> fragmente = Arrays.asList("FreiTaG", "13", "Datei", "Liste");
//		final String Fragment1 = "FreiTaG";
//		final String Fragment2 = "13";
		final String extension = ".java";
		final long laengeMin = 1_000;
		final long laengeMax = 2_000;
		final LocalDate startDatum = LocalDate.of(2024, 9, 03); // 2024!
		final LocalDate endeDatum = LocalDate.of(2025, 9, 10);
		
		long startMillis = LocalDateTime.of(startDatum, LocalTime.MIN)
                .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long endMillis   = LocalDateTime.of(endeDatum, LocalTime.MAX)
                .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        
		Predicate<File> pf = f ->  {
//		f.getName().toLowerCase().endsWith(extension.toLowerCase()) &&
//									f.getName().toLowerCase().contains(Fragment1.toLowerCase()) &&
//									f.getName().toLowerCase().contains(Fragment2.toLowerCase()) &&
//									f.length() >= laengeMin &&
//									f.length() <= laengeMax &&
//									f.lastModified() >= LocalDateTime.of(startDatum, LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() &&
//									f.lastModified() <= LocalDateTime.of(endeDatum, LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
//		dir(dir, pf);
//	}
// 
		String name = f.getName().toLowerCase();

        // Bedingung: alle Fragmente müssen vorkommen
        boolean alleFragmente = fragmente.stream()
                .anyMatch(fr -> name.contains(fr.toLowerCase()));

        return name.endsWith(extension.toLowerCase()) &&
               alleFragmente &&
               f.length() >= laengeMin &&
               f.length() <= laengeMax &&
               f.lastModified() >= startMillis &&
               f.lastModified() <= endMillis;
    };

    dir(dir, pf);
}
	static void dir(File dir, Predicate<File> p) {
		File[] fa = dir.listFiles();
		if (fa == null) {
			return;
		}
 
		for (File e : fa) {
			if (e.isDirectory()) {
				dir(e, p);
			} else { // Datei
				tuwas(e, p);
			}
		}
	}
 
	static void tuwas(File e, Predicate<File> p) {
		if (p.test(e)) {
            LocalDate datum = LocalDateTime.ofInstant(
                    Instant.ofEpochMilli(e.lastModified()), ZoneId.systemDefault()
            ).toLocalDate();

            System.out.println("File: " + e + " " + e.length() + " " + datum);
		}
	}
 
}
 
 