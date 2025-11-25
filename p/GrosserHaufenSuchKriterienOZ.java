package p;

import java.io.File;

public class GrosserHaufenSuchKriterienOZ {

		static int anzahl = 0;
	 
		public static void main(String[] args) {
	 
			File f = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src");


			String extension = ".java";

			String string_laenge = "5000";

			String suchKriterien;

//			suchKriterien = JOptionPane.showInputDialog("Bitte geben Sie alle Suchkriterien durch Leerzeichen getrennt ein.");

			suchKriterien ="Verbrauch AK Loes api lese auto max speed scan";

//			Verbrauch .java speed auto    in api

//			extension = JOptionPane.showInputDialog("Wie ist die Dateiendung?");

//			string_laenge = JOptionPane.showInputDialog("Wie Groß darf die Datei höchstens sein?");

			long laenge = Integer.parseInt(string_laenge); // impli. Casting von int zu long
	 
//			System.out.println("Die Datei mit den geforderten Suchkriterien: " + suchname1 + " ," + suchname2 + " ,"

//					+ extension + " , Größe <= " + laenge + ":");
	 
			dir(f, suchKriterien, extension, laenge);
	 
			System.out.println("Es wurden " + anzahl + " Dateien Gefunden.");
	 
		}
	 
		static void dir(File dir, String suchKriterien, String extension, long laenge) {

			File[] fa = dir.listFiles();

			if (fa != null) {

				for (File e : fa) {

					if (e.isDirectory()) {

						dir(e, suchKriterien, extension, laenge);

					} else { // ist eine Datei

						tuwas(e, suchKriterien, extension, laenge);

					}

				} // eof

			} // eoi

		} // eom
	 
		static void tuwas(File e, String suchKriterien, String extension, long laenge) {

	// Übung: Bitte finden Sie alle Dateien, die die angegebenen Suchkriterien erfüllen (Anzahl "grenzenlos" also max. 2 Mrd. 32 Bit positiv)

//			Die Suchkriterien bezogen auf den Datei- oder Pfad-Namen befinden sich in einem String jeweils durch Leerzeichen getrennt.

//			Tipp: split-Methode verwenden

			String [] suchKriterium = suchKriterien.split(" ");

			boolean stimmt = true;

			for(String el : suchKriterium) {

				if(!e.getAbsolutePath().toLowerCase().contains(el.toLowerCase()))

					stimmt = false;
					break;
			}

			if(stimmt && e.getName().endsWith(extension) && e.length() <= laenge) {

				anzahl++;

				System.out.println(e + " " + e.length());

			}

		}
	 
	} // eoc

	 