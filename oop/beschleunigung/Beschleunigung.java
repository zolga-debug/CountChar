package oop.beschleunigung;

import oop.beschleunigungST.Auto;

public class Beschleunigung {
	public static void main(String[] args) {
		Auto a1 = new Auto();

		System.out.println("Ihre aktuelle Geschwindigkeit beträgt: " + a1.geschwindigkeit + "km/H");

		for (int i = 0; i < 10; i++) {
			a1.beschleunigen();
			System.out.println("Sie beschleunigen.\nDie neue Geschwindigkeit beträgt: " + a1.geschwindigkeit + "km/H");
		}
	}
}

class Auto {
	int geschwindigkeit = 0;
	
	boolean rekuperation;
	int rekuperationInProzent = 80;
 
	void beschleunigen() {
 
		geschwindigkeit++;
	}
	void bremsen() {
		geschwindigkeit --;
		
	}
}
 