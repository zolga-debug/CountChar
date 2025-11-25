package oop.beschleunigungAK;


public class BeschleunigungAK {
	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.beschleunigen();
		System.out.println("Ich fahre jetzt "+a1.geschwindigkeit+" Km/h...WHOOOAAAHHHH, so schnell war ich noch nie!!!!!");
		a1.beschleunigen();
		System.out.println("Ich fahre jetzt "+a1.geschwindigkeit+" Km/h...WHOOOAAAHHHH, so schnell war ich noch nie!!!!!");
		a1.beschleunigen();
		System.out.println("Ich fahre jetzt "+a1.geschwindigkeit+" Km/h...WHOOOAAAHHHH, so schnell war ich noch nie!!!!!");
 
	}
 
}
 
class Auto {
	
	int geschwindigkeit = 0;
	
	void beschleunigen() {
		geschwindigkeit += 1;
	}
}
 