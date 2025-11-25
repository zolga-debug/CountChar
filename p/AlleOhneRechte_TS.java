package p;

import java.io.File;

public class AlleOhneRechte_TS {

	public static void main(String[] args) {
		File f = new File("c:\\");
//		/* File */ f = new File("C:\\Windows\\System32");
		dir(f);
	}
 
	static void dir(File dir) { //
		File[] fa = dir.listFiles();
 
		if (fa == null) {
			System.out.println("nicht lesbar: " + dir.getAbsolutePath());
			return;
		}
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e);
				}
			}
	}
}
 