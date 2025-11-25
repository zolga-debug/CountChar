package oop.status;

public class Status {

	public static void main(String[] args) {
		Auto a1 = new Auto();
//	Übung: Bitte schreiben Sie eine M., die status() heißt und den Beispiel-Text "Ich fahre gerade 50 km/h" in der Console ausgibt.
//	Bitte rufen Sie den Status in der main() ab.
//		Beschleunigen Sie zuvor bitte auf 1 km/h

	}
}


class Auto {
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
