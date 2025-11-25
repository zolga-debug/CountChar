package oop.pm.suv;

import java.util.ArrayList;



//@formatter:off
class Auto{int geschwindigkeit; void beschleunigen() {geschwindigkeit++;} void bremsen() {geschwindigkeit--;}}
class Cabrio extends Auto{boolean dachOffen;void oeffneDach(){dachOffen=true;}void schliesseDach(){dachOffen=false;}}
class Suv extends Auto {boolean isAllradOn;void allradOn(){isAllradOn=true;}void allradOff(){isAllradOn=false;}}
//@formatter:on

class Mechaniker{
	void autoTesten(Auto fahrzeug) {
//		Übung: Der Mechaniker überprüft Autos (z.B. Suv und Cabrios). Seine Aufgabe ist es einmal zu beschleunigen
//		und zu bremsen.
//		Wenn er ein Cabrio prüfen soll, dann testet er ob sich das Dach öffen und schließen lässt.
//		Wenn er ein SUV prüfen soll, dann testet er ob sich der Allrad-Antrieb ein- und ausschalten läßt.
		System.out.println("=== Teste Fahrzeug: " + fahrzeug.getClass().getSimpleName() + " ===");
		
		fahrzeug.beschleunigen();
        fahrzeug.bremsen();
        
        if (fahrzeug instanceof Cabrio) {
            Cabrio cab = (Cabrio) fahrzeug;

            cab.oeffneDach();
           System.out.println("Dach ist " + (cab.dachOffen ? "offen" : "geschlossen"));

            cab.schliesseDach();
            System.out.println("Dach ist " + (cab.dachOffen ? "offen" : "geschlossen"));
        }
 	        
        if (fahrzeug instanceof Suv) {
        	Suv suv = (Suv)fahrzeug;
        	suv.allradOff();
         	System.out.println("Allrad ist " + (suv.isAllradOn ? "eingeschaltet" : "ausgeschaltet"));
            suv.allradOn();
            System.out.println("Allrad ist " + (suv.isAllradOn ? "eingeschaltet" : "ausgeschaltet"));
        }
	       System.out.println();
	}
	
}
	
   
 class Werkstatt {

	public static void main(String[] args) {
//		Übung: Der Mechaniker erhält die Aufgabe 5 Fahrzeuge zu überprüfen. Bitte speichern Sie Cabrios, SUVs 
		//		und Autos in einer ArrayList.
		
Mechaniker vasya = new Mechaniker();
	    
		ArrayList<Auto>fahrzeuge = new ArrayList<>();
	    fahrzeuge.add(new Auto());
        fahrzeuge.add(new Cabrio());
        fahrzeuge.add(new Auto());
	    fahrzeuge.add(new Cabrio());
        fahrzeuge.add(new Suv());
		
        for (Auto fahrzeug : fahrzeuge) {
            vasya.autoTesten(fahrzeug);
        }
      
	}	
		
		
	}


