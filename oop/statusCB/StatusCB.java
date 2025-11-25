package oop.statusCB;

public class StatusCB {

	public static void main(String[] args) {
		Auto a1 = new Auto();

		a1.beschleunigen();
		a1.status();

	}
}

class Auto {
	int geschwindigkeit = 0;

	void beschleunigen() {
		geschwindigkeit++;
	}

	void bremsen() {
		geschwindigkeit--;
	}

	void status() {
		System.out.printf("Ich fahre gerade %d km/h", geschwindigkeit);
	}
}
