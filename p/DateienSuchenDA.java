package p;

import java.io.File;

public class DateienSuchenDA {

	static int anzahlDateien = 0;
	static String suchname1="aRbeit".toLowerCase(); // z.B. "Verbrauch"
	static String suchname2="KOSTEN".toLowerCase(); // z.B. "Loes"
	static String extension=".java".toLowerCase();
	static long laenge=1_000;
	
	public static void main(String[] args) {
		File f = new File("C:\\");
		
//		Übung: Bitte suchen Sie Dateien, die die folgenden Forderungen erfüllen
//		Suchkriterien:
		/* File */ f = new File("C:\\Users\\\\eclipse-workspace"); // Verzeichnis
		/*File*/ f = new File("G:\\P\\ws_jee2025_03\\J_2506");
		dirNameGroesse(f);
		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Java-Dateien vorhanden.");
	}
 
	static void dirNameGroesse(File dir) { //
 
		File[] fa = dir.listFiles();
 
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dirNameGroesse(e);
				} else if (e.getAbsolutePath().contains(suchname1) && e.getAbsolutePath().contains(suchname2)
							&& e.getName().endsWith(extension) && e.length() < laenge) {
					
					System.out.println(e + " " + e.length());
					anzahlDateien++;
				}
			}
		} else {
//			System.out.println(dir);
		}
	}
 
}
 
 