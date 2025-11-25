package p;

import java.io.File;

public class OhneNPE_AKDA {

	public static void main(String[] args) {
		File f = new File("c:\\");
		/* File */ f = new File("C:\\Windows\\System32");
		dir(f);
	}

	static void dir(File dir) { //
		File[] fa = dir.listFiles();
//		Übung: Bitte sichern Sie die NPE ab
		if (fa != null) // AK, DA
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e);
				} else {
//					System.out.println("File: " + e);
				}
			}
	}
}
