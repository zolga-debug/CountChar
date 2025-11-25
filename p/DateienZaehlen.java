package p;

import java.io.File;

public class DateienZaehlen {
	static int anzahlDateien = 0;

	public static void main(String[] args) {
		File f = new File("c:\\");
		/* File */ f = new File("C:\\Windows\\System32");
		dir(f);
//		Übung: Bitte zählen Sie alle Dateien im aktuellen Verz. und allen Unterverz.
		System.out.println("Im Verzeichnis sind " + anzahlDateien + " Dateien enthalten");
//		DA+AK: Im Verzeichnis sind 25275 Dateien enthalten
	}

	static void dir(File dir) { //
		File[] fa = dir.listFiles();
		if (fa != null) { //
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e);
				} else {
//					System.out.println("File: " + e);
					anzahlDateien++;
				}
			}
		}
	}
}
