package p;

import java.io.File;

public class DateienSuchenCB {

	static int anzahlDateien = 0;
 
	public static void main(String[] args) {
		File f = new File("C:\\");
		
//		Übung: Bitte suchen Sie Dateien, die die folgenden Forderungen erfüllen
//		Suchkriterien:
		/* File */ f = new File("C:\\Users\\distr\\OneDrive - Bildungsakademie Hannover GmbH\\Dokumente\\java_workspace"); // Verzeichnis
		/*File*/ f = new File("G:\\P\\ws_jee2025_03\\J_2506");
		
		
//		Übung: Bitte lesen Sie die Suchkriterien von der Tastatur ein.
//		Verwenden Sie dazu bitte die Klasse JOptionPane
		1120
		String suchname1="array"; // z.B. "Verbrauch"
		String suchname2=""; // z.B. "Loes"
		String extension=".java";
		long laenge=1_000;
		
		dirNameGroesse(f, suchname1.toLowerCase(), suchname2.toLowerCase(), extension.toLowerCase(), laenge); // doppelte toLower()
		// System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Java-Dateien vorhanden.");
	}
 
	static void dirNameGroesse(File dir, String suchname1, String suchname2, String extension, long laenge) { //
 
		File[] fa = dir.listFiles();
 
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dirNameGroesse(e, suchname1, suchname2, extension, laenge);
				} else if (e.getName().toLowerCase().contains(suchname1) && e.getName().toLowerCase().contains(suchname2) && e.getName().toLowerCase().endsWith(extension) && e.length() < laenge) {
					System.out.println(e + " " + e.length()); // Ausgabe mit Länge
					anzahlDateien++;
				}
			}
		} else {
//			System.out.println(dir);
		}
	}
}
 