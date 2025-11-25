package oop.anhaltenCB;

public class AnhaltenCB {

	public static void main(String[] args) {
//		Übung:
//		Bitte schreiben Sie eine M. anhalten(), die beim Aufruf das Auto schrittweise bis zum Stillstand abbremst.
//		Testen Sie Ihre M. mit 2 Objekten (Susi und Otto).
		
		Auto a1 = new Auto();
		Auto a2 = new Auto();

//		a1.setName("Susi");
		a1.beschleunigen();
		a1.status();

//		a2.setName("Otto");
		a2.beschleunigen();
		a2.beschleunigen();
		a2.beschleunigen();
		a2.bremsen();
		a2.status();
		a2.anhalten();
		a2.status();
		System.out.println("Ende");
	}

}
class Auto{
	int geschwindigkeit = 0; 
	String name;
	boolean onePedaleDrive; // iPedale
	
//	Übung: Bitte sorgen Sie dafür, dass es nicht 2 versch. Bremsverhalten gibt.
//	Die Verzögerung soll immer an nur einer(!) Stelle geändert werden.
//	Tipp: s.a. Stack
	
	
	void anhalten() {
	//	if (geschwindigkeit > 0) {
			for (;geschwindigkeit > 0; geschwindigkeit--) {
//			System.out.println("bremsen, bremsen, bremsen! " + name + " fährt nur noch " + geschwindigkeit + " km/h");
			}
		}
//	}
 
 
	void beschleunigen() {
		geschwindigkeit += 1;
	}
	void bremsen() {
//		if (geschwindigkeit > 0) geschwindigkeit --; // Standard-Bremsen
		if (geschwindigkeit > 0) geschwindigkeit-=2 ; // Keramik-Bremsen im SuperSportWagen
	}
 
	void status() {
		System.out.println(name+" fährt gerade "+geschwindigkeit+" Km/h");
	}
}