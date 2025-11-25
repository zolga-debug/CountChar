package api.lesen_auto;


import java.util.List;

import javax.swing.JFileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;




public class Verbrauch {
}
class Auto{
//	https://www.zdf.de/play/shows/mai-think-x-die-show-102/maithink-x-sendung35-efuels-vs-eauto-100
	String hersteller;
	String modell;
	char antriebsArt;
	double verbrauch;
	double verbrauchInKWH;
	int maxSpeed;
//	Änderung der Spezifikation:
//	Es soll die Höchstgeschwindigkeit auch Berücksichtigung finden (Konstruktor, toString etc.).
//	Die Änderungen / Erweiterung sollen im PRG und i.d. Datendatei vorgenommen werden. Neuer Name sei "Gegenüberstellung_Verbrenner_BEV_speed.csv
//	zusätzliches Field: maxSpeed
	/*
	 230
	 190
	 165
	 200
	 210
	 230
	 160
	 */
	

	
	Auto(String hersteller, String modell, char antriebsart, double verbrauch, int maxSpeed){
		this.hersteller = hersteller;
		this.modell = modell;
		this.antriebsArt = antriebsart;
		this.verbrauch = verbrauch;
		this.maxSpeed = maxSpeed;
		if(antriebsart != 'E') {
			switch (antriebsart) {
			case 'd':
			case 'D':
				verbrauchInKWH = verbrauch * 10;
				break;
			case 'b':
			case 'B':
				verbrauchInKWH = verbrauch * 10;
				break;
			case 'w':
			case 'W':
				verbrauchInKWH = verbrauch * 33; // 1 kg H2 enthält 33 KWh
			default:
				break;
			}
		
			
			
		}
		
	}
	
	@Override
	public String toString() {
		if(Character.toLowerCase(antriebsArt) == 'e') {
			return "Der "+hersteller+" "+modell+" "+antriebsArt+" verbraucht auf 100 km "+verbrauch+" KWH,"+ " "+ " "+ "max speed " + maxSpeed+" Kmh";
		}else if(Character.toLowerCase(antriebsArt) == 'b') {
			return "Der "+hersteller+" "+modell+" "+antriebsArt+" verbraucht auf 100 km "+verbrauch+" Liter, was "+verbrauchInKWH+" KWH entspricht,"+ " "+ " "+ "max speed "+ maxSpeed+" Kmh";
		}else if(Character.toLowerCase(antriebsArt) == 'd') {
			return "Der "+hersteller+" "+modell+" "+antriebsArt+" verbraucht auf 100 km "+verbrauch+" Liter, was "+verbrauchInKWH+" KWH entspricht,"+ " "+ " "+ "max speed "+ maxSpeed+" Kmh";
		}else {
			return "Der "+hersteller+" "+modell+" "+antriebsArt+" verbraucht auf 100 km "+verbrauch+" Kg, was "+verbrauchInKWH+" KWH entspricht,"+ " "+ " "+ "max speed "+ maxSpeed+" Kmh";
		}
		
	}
	static void geschwFilter(int maxSpeed, ArrayList<Auto> autos) {
		
		for (Auto a : autos) {
		if (a.maxSpeed > 199) {
			System.out.println(a);
		}
		}
	}
 
}
 
class CarJacker {
 
	public static void main(String[] args) throws IOException{
		
		List<String> inhalt = Files.readAllLines(dateiAuswerten().toPath(), StandardCharsets.ISO_8859_1);
		
		ArrayList<Auto> autos = new ArrayList<Auto>();
		
		
		for (int i = 1; i < inhalt.size(); i++) {
			String[] zeile = inhalt.get(i).split(";");
			
//			autos.add(new Auto(zeile[0], zeile[1], (char)zeile[2].charAt(0),(double)Double.parseDouble(zeile[3])));
			autos.add(new Auto(zeile[0], zeile[1], (char)zeile[2].charAt(0),/*(double)*/Double.parseDouble(zeile[3]), Integer.parseInt(zeile[4])));
		}
		Auto.geschwFilter(0, autos);
		
		
//		for (Auto a : autos) {
//			if (a.maxSpeed >= 200 ) {//>199
//				
//				System.out.println(a);
//			}
		
//		}
 
	}
 
		
 
	static File dateiAuswerten() {
		
		File quelle = new File("");
		JFileChooser file = new JFileChooser();
		file.setDialogTitle("Bitte eine Quelldatei wählen.");
		int returnWert = file.showDialog(null, "OK");
		if (returnWert == JFileChooser.APPROVE_OPTION) {
			quelle = file.getSelectedFile();
			System.out.println("Sie haben die Datei "+quelle+" gewählt!");
			return quelle;
		} else {
			System.out.println("Wenn du nicht wählst, wähle ich für Dich!!!!!!!");
//			return new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachNameWin.csv");//mrEfflingsQuelle
			return new File("C:\\Users\\User\\eclipse-workspace\\MeineImporte\\api\\lesen_auto\\Gegenüberstellung_Verbrenner_BEV_speed.csv");
			//mrEfflingsQuelle
//			return new File("src/api/lesen/autosEinlesen/Gegenüberstellung_Verbrenner_BEV_short.csv");
		}
 
	}
 
}
 
