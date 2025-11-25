package p;

import java.io.File;

public class JavaDateienZaehlenDA {

	static int anzahlDateien = 0;

	public static void main(String[] args) {
		File f = new File("C:\\");
		/* File */ f = new File("G:\\P\\ws_jee2025_03\\J_2506");
		dir(f);
		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Java-Dateien vorhanden.");
//		Im Verzeichnis G:\P\ws_jee2025_03\J_2506 sind 381 Java-Dateien vorhanden.
	}

	static void dir(File dir) { //

		File[] fa = dir.listFiles();

		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e);
				} else if (e.getName().endsWith(".java")) {
					System.out.println(e+"\t\t"+e.length());
//					Übung: Bitte suchen Sie im Baum alle Java-PRGs, die Arbeit im Dateinamen haben und kleiner als 1KB sind
					anzahlDateien++;
				}
			}
		} else {
//			System.out.println(dir);
		}
	}

}
