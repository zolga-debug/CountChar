package p;

import java.io.File;

public class AlleOhneRechte {
	static int i; // nur wg. Blockverzicht
	public static void main(String[] args) {
		File f = new File("c:\\");
		/* File */ f = new File("C:\\Windows\\System32");
		dir(f);
	}

	static void dir(File dir) { // sehr gefährlicher Code wg. Block-Verzicht
		File[] fa = dir.listFiles();
//		Übung: Bitte geben Sie nur die Verzeichnisse i.d. Console aus, wo keine Leserechte existieren
		if (fa != null) // AK, DA
			for (File e : fa) 
				if (e.isDirectory()) 
					dir(e);
				 else 
//					System.out.println("File: " + e);
					 i++;
//		i--;
		else System.out.println(dir);
	}
}
