package oop.statusAK;

public class StatusAK {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		
		a1.beschleunigen();
		a1.status();

	}

}

class Auto {
	
	int geschwindigkeit = 0;
	
	void beschleunigen() {
		geschwindigkeit += 1;
	}
	
	void bremsen() {
		geschwindigkeit -= 1;
	}
	
	void status() {
		System.out.println("Ich fahre gerade "+geschwindigkeit+" Km/h");
	}
}

