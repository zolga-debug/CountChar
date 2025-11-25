package oop.anhalten;

import oop.bremsen.Auto;

public class Anhalten {

	public static void main(String[] args) {
//		Übung:
//		Bitte schreiben Sie eine M. anhalten(), die beim Aufruf das Auto schrittweise bis zum Stillstand abbremst.
//		Testen Sie Ihre M. mit 2 Objekten (Susi und Otto).
		Auto a1 = new Auto ();
		Auto a2 = new Auto();
		a1.setName("Susi");
		
		a2.setName("Otto");
        
		for (int i = 0; i < 10; i++) {
			a1.beschleunigen();
}
		a1.status();
		
		for (int i = 10; i < 0; i--) {
			a2.bremsen();
}	
		 a2.status();
		 a1.anhalten();
         a2.anhalten();
	
	for (int i = 0; i < 10; i++) {
		a1.beschleunigen();
	}		
	}

	}
class Auto{
	int speed = 0; 
	String name;
	boolean onePedaleDrive; // iPedale
	
	void setName (String name) {
		this.name = name;
	}
	void beschleunigen() {
		speed += 1;
	}
	void bremsen() {
		if (speed > 0) speed-=2;// Keramik-Bremsen im SportWagen
	}
 
	void status() {
		System.out.println(name+" fährt gerade "+ speed +" Km/h");
	}
	void anhalten() {
		if (speed > 0) {
			for (;speed > 0; speed--) {
	System.out.println("bremsen, bremsen, bremsen! " + name + " fährt nur noch " + speed + " km/h");
			
			}	
		}	
	}	
		
}
