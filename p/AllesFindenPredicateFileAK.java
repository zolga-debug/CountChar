package p;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Predicate;

public class AllesFindenPredicateFileAK {

	public static void main(String[] args) {
		File dir = new File("G:\\P\\ws_jee2025_03\\J_2506"); // Verzeichnis
//		dir = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");
		
		final String Fragment1 = "FreiTaG";
		final String Fragment2 = "13";
		final String extension = ".java";
		final long laengeMin = 1_000;
		final long laengeMax = 2_000;
		final LocalDate startDatum = LocalDate.of(2024, 9, 03); // 2024!
		final LocalDate endeDatum = LocalDate.of(2025, 9, 10);
		
		Predicate<File> pf = f ->   f.getName().toLowerCase().endsWith(extension.toLowerCase()) &&
									f.getName().toLowerCase().contains(Fragment1.toLowerCase()) &&
									f.getName().toLowerCase().contains(Fragment2.toLowerCase()) &&
									f.length() >= laengeMin &&
									f.length() <= laengeMax &&
									f.lastModified() >= LocalDateTime.of(startDatum, LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() &&
									f.lastModified() <= LocalDateTime.of(endeDatum, LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
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
			LocalDate datum = LocalDateTime.ofInstant(Instant.ofEpochMilli(e.lastModified()), ZoneId.systemDefault()).toLocalDate();
			
			System.out.println("File: " + e + " " + e.length()+" "+datum);		
		}
	}
 
}
 
 