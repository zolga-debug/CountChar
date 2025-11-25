package p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class InDateiSuchenAK {

	public static void main(String[] args){
		File f = new File("C:\\Users\\User\\eclipse-workspace\\j_2506"); // Verzeichnis
		
		String sucheInDatei = "==null";
		
		dir(f, sucheInDatei);
	}
 
	static void dir(File dir, String suche){
		File[] fa = dir.listFiles();
		if (fa == null) {
			return;
		}
 
		for (File e : fa) {
			if (e.isDirectory()) {
				dir(e, suche);
			} else { // Datei
				if (e.getName().toLowerCase().endsWith(".java")) {
					tuwas(e, suche);
				}
			}
		}
	}
 
	static void tuwas(File e, String suche){
		
		List<String> inhalt = null;
		
		try {
			inhalt = Files.readAllLines(e.toPath());
		} catch (IOException exc) {
			System.out.println("Datei konnte nicht gelesen werden!");
			return;
		}
		
		
		// Suchbegriff ohne Leerzeichen
	    String sucheOhneSpace = suche.replaceAll("\\s+", "");
	    
	    for (String zeile : inhalt) {
	        String zeileOhneSpace = zeile.replaceAll("\\s+", "");
	        if (zeileOhneSpace.contains(sucheOhneSpace)) {
	            System.out.println("File: " + e);
	            break;
	        }
	    }
	}
	}
//		for (String zeile : inhalt) {
//			if (zeile.contains(suche)) {
//				System.out.println("File: " + e);
//				break;
			
// Übung: Trotz falschem Suchstring (	String sucheInDatei = "==null";) soll korrete Ausgabe erfolgen:
//File: G:\P\ws_jee2025_03\J_2506\src\api\StringMethoden.java
//File: G:\P\ws_jee2025_03\J_2506\src\methoden\ArrayLaenge.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\AlleOhneRechte_TS.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\InDateiSuchen.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\InDateiSuchenAK.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\InDateiSuchenCB.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\InDateiSuchenDA.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\NurJavaPrgsFinden.java
//File: G:\P\ws_jee2025_03\J_2506\src\p\OhneNPE_GT.java
//File: G:\P\ws_jee2025_03\J_2506\src\verzweigung\SechsFaelleUnterscheiden.java