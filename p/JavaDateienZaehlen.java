package p;

import java.io.File;

public class JavaDateienZaehlen {

		static int anzahlDateien = 0;

		public static void main(String[] args) {
			File f = new File("c:\\");
			/* File */ f = new File("C:\\Windows\\System32");
			/* File */ f = new File("G:\\P\\ws_jee2025_03\\J_2506");
			dir(f);
//			Übung: Bitte zählen Sie alle Java-Dateien im Projekt-Verz. 
			1315
			
			Bitte denken Sie an die Lösung der 9 Aufg. von Donnerstag
			
			System.out.println("Im Verzeichnis sind " + anzahlDateien + " Dateien enthalten");
		}

		static void dir(File dir) { //
			File[] fa = dir.listFiles();
			if (fa != null) { //
				for (File e : fa) {
					if (e.isDirectory()) {
						dir(e);
					} else {
//						System.out.println("File: " + e);
						anzahlDateien++;
					}
				}
			}
		}
	}