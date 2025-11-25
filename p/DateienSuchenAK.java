package p;

import java.io.File;

public class DateienSuchenAK {
	static int anzahl = 0;
 
	public static void main(String[] args) {
 
		File f = new File("G:\\P\\ws_jee2025_03\\J_2506");
//		f = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");
 
		String suchname1 = "AK";
		String suchname2 = "";
		String extension = ".java";
		long laenge = 1_000;
		
		System.out.println("Die Datei mit den geforderten Suchkriterien: " + suchname1 + " ," + suchname2 + " ,"
				+ extension + " , Größe <="+laenge+":");
 
		dir(f, suchname1, suchname2, extension, laenge);
		
		System.out.println("Es wurden "+anzahl+" Dateien Gefunden.");
 
	}
 
	static void dir(File dir, String suchname1, String suchname2, String extension, long laenge) {
		File[] fa = dir.listFiles();
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e, suchname1, suchname2, extension, laenge);
				} else if (e.getName().endsWith(extension) & e.getName().contains(suchname1)
							& e.getName().contains(suchname2) & e.length() <= laenge) {
						anzahl++;
						System.out.println(e);
					}
				}
			}
		}
	}
 