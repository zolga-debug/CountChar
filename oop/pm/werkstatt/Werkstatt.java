package oop.pm.werkstatt;

import java.util.ArrayList;

//@formatter:off
class Auto{int geschwindigkeit; void beschleunigen() {geschwindigkeit++;} void bremsen() {geschwindigkeit--;}}
class Cabrio extends Auto{boolean dachOffen;void oeffneDach(){dachOffen=true;}void schliesseDach(){dachOffen=false;}}
//@formatter:on

class Mechaniker{
	void autoTesten(Auto fahrzeug) {
//		Übung: Der Mechaniker überprüft Autos (auch Cabrios). Seine Aufgabe ist es einmal zu beschleunigen 
//		und zu bremsen.
//		Wenn er ein Cabrio prüfen soll, dann testet er ob sich das Dach öffen und schließen lässt.
		
		// Beschleunigen und Bremsen
        fahrzeug.beschleunigen();
        fahrzeug.bremsen();
        
     // Prüfen ob Cabrio
       if (fahrzeug instanceof Cabrio) {
    	   if(fahrzeug instanceof Cabrio) {
   			((Cabrio) fahrzeug).oeffneDach();
   		
   			((Cabrio) fahrzeug).schliesseDach();
   			System.out.println("Dach öffnet Korrekt");
			}else {
				System.out.println("Dach öffnet nicht Korrekt");
			}
    		} 	
	}
}
	  


 class Werkstatt {

	public static void main(String[] args) {
	//		Übung: Der Mechaniker erhält die Aufgabe 5 Fahrzeuge zu überprüfen. 
	//	Bitte speichern Sie Cabrios und Autos in einer ArrayList.
		
		Mechaniker mechaniker = new Mechaniker();
	    
		ArrayList<Auto>fahrzeuge = new ArrayList<>();
	    fahrzeuge.add(new Auto());
        fahrzeuge.add(new Cabrio());
        fahrzeuge.add(new Auto());
	    fahrzeuge.add(new Cabrio());
        fahrzeuge.add(new Cabrio());
       
        for (Auto fahrzeug : fahrzeuge) {
            mechaniker.autoTesten(fahrzeug);
        }
	
	}

}

