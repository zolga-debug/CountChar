package p;

import java.io.File;

public class DateienSuchenJOPAK_mitToDoMethode {

	static int anzahl = 0;

	public static void main(String[] args) {

		File f = new File("C:\\Users\\User\\eclipse-workspace");
//		f = new File("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");
		String suchname1 = "Exc";
		String suchname2 = "class";
		String extension = "java";
		String string_laenge = "1000";
//		suchname1 = JOptionPane.showInputDialog("Wie lautet der 1. Suchoperator?");
//		String suchname2 = JOptionPane.showInputDialog("Wie lautet der 2. Suchoperator?");
//		extension = JOptionPane.showInputDialog("Wie ist die Dateiendung?");
//		string_laenge = JOptionPane.showInputDialog("Wie Groß darf die Datei höchstens sein?");
		long laenge = Integer.parseInt(string_laenge); // impli. Casting von int zu long

		System.out.println("Die Datei mit den geforderten Suchkriterien: " + suchname1 + " ," + suchname2 + " ,"
				+ extension + " , Größe <= " + laenge + ":");

		dir(f, suchname1, suchname2, extension, laenge);

		System.out.println("Es wurden " + anzahl + " Dateien Gefunden.");

	}

	static void dir(File dir, String suchname1, String suchname2, String extension, long laenge) {
		File[] fa = dir.listFiles();
		if (fa != null) {
			for (File e : fa) {
				if (e.isDirectory()) {
					dir(e, suchname1, suchname2, extension, laenge);
				} else { // ist eine Datei
					tuwas(e, suchname1, suchname2, extension, laenge);
				}
			} // eof
		} // eoi
	} // eom

	static void tuwas(File e, String suchname1, String suchname2, String extension, long laenge) {

		if (e.getName().endsWith(extension) & e.getName().toLowerCase().contains(suchname1.toLowerCase())
				& e.getName().toLowerCase().contains(suchname2.toLowerCase()) & e.length() <= laenge) {
			anzahl++;
			System.out.println(e + " " + e.length());
		} // eoi
	}

} // eoc
