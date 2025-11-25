package p;

import java.io.File;

import javax.swing.JOptionPane;

public class SuchenDACB {
	static int anzahlDateien = 0;
	
	
	
	public static void main(String[] args) {
		File f = new File("C:\\");
		 String suchname1=JOptionPane.showInputDialog("Suchkriterium1:"); 
		 String suchname2=JOptionPane.showInputDialog("Suchkriterium2:"); 
		 String extension= JOptionPane.showInputDialog("extention:");
		 String laengeS= JOptionPane.showInputDialog("Max Groesse in Bytes 1000:");
		 long laenge = Integer.parseInt(laengeS);
		
		 System.out.println("Die Datei mit den geforderten Suchkriterien: " + suchname1 + " ," + suchname2 + " ,"
					+ extension + " , Größe <= "+laenge+":");
//		Übung: Bitte suchen Sie Dateien, die die folgenden Forderungen erfüllen
//		Suchkriterien:
		/* File */ f = new File("\"C:\\Users\\User\\eclipse-workspace\\j_2506\\src\""); // Verzeichnis

 
		dir(f, suchname1,  suchname2, extension, laenge);
		System.out.println("Im Verzeichnis " + f + " sind " + anzahlDateien + " Java-Dateien vorhanden.");
	}

	static void dir(File dir, String suchname1, String suchname2, String extension, long laenge) {
			
		File[] fa = dir.listFiles();

		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e, suchname1,  suchname2, extension,  laenge);
				} else {
					if (e.getName().endsWith(extension) && e.getName().contains(suchname1)
							&& e.getName().contains(suchname2)
							&& e.length()< laenge) {
				}
					System.out.println(e + " " + e.length());
					anzahlDateien++;
				}
			}
		} else {
//			System.out.println(dir);
		}
	}

}
