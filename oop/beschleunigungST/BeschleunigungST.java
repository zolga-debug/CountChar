package oop.beschleunigungST;

public class BeschleunigungST {

	public static void main(String[] args) {
		Auto a1 = new Auto();

		System.out.println("Ihre aktuelle Geschwindigkeit beträgt: " + a1.geschwindigkeit + "km/H");

		for (int i = 0; i < 10; i++) {
			a1.beschleunigen();
			System.out.println("Sie beschleunigen.\nDie neue Geschwindigkeit beträgt: " + a1.geschwindigkeit + "km/H");
		}
	}
}

//	Übung: Bitte schreiben Sie eine M., die status() heißt und den Beispiel-Text "Ich fahre gerade 50 km/h"
//	Bitte rufen Sie den Status in der main() ab.

public class Auto {
	int geschwindigkeit = 0;

	boolean rekuperation;
	int rekuperationInProzent = 80;
	
	void beschleunigen() {

		geschwindigkeit += 1;
	}
	void bremsen() {
		geschwindigkeit --;
	}
 
}
