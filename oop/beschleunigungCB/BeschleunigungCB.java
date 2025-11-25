package oop.beschleunigungCB;

public class BeschleunigungCB {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		
		int maxSpeed = 12;
		
		System.out.println("Aktuelle Geschwindigkeit: " + a1.geschwindigkeit);
		
		for (int i = a1.geschwindigkeit ; i < maxSpeed ; i++) {
			a1.beschleunigen();
			System.out.println("BrummBrumm ➝ neue Geschwindigkeit: " + a1.geschwindigkeit);
		}
		
		
	}
}
 
class Auto {
	int geschwindigkeit = 0;
 
	void beschleunigen() {
 
		geschwindigkeit++;
	}
}
 