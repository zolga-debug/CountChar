package oop.name;

public class Name {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.beschleunigen();
		a1.status();
		
//		Übung1: Bitte geben Sie einem Auto einen Namen. Verwenden Sie dazu die setName-M. Übergeben Sie dieser M. einen String.
		a1.setName("Susi");
//		Übung2: Modifizeieren SIe dann die status()-M. so, dass z.B. folgender Text erscheint: Susi fährt gerade 1 km/h.		
		a1.status();
		1315
	}
}


class Auto {
	int geschwindigkeit = 0;
	String name;
	boolean rekuperation;
	int rekuperationInProzent = 80;
	
	void beschleunigen() {

		geschwindigkeit += 1;
	}
	void bremsen() {
		geschwindigkeit --;
	}
 
	void status() {
		System.out.println("Ich fahre gerade "+geschwindigkeit+" Km/h");
	}
}