package oop.statusKK;

public class StatusKK {
	public static void main(String[] args) {

		Auto a1 = new Auto();

		System.out.println(a1.geschwindigkeit + " km/h");
		a1.beschleunigen();
		System.out.println(a1.geschwindigkeit + " km/h");
		a1.beschleunigen();
//a1.bremsen(0);
		System.out.println(a1.geschwindigkeit + " km/h");
//a1.bremsen(200);

		a1.status(50);
	}
}

class Auto {
	int geschwindigkeit = 0;
	int maxGeschwindigkeit = 60;
	int status = geschwindigkeit;

	void beschleunigen() {
		int rest = maxGeschwindigkeit - geschwindigkeit;

		if (rest <= 0) {
			System.out.println(
					"Elektrische Drosselung aktiviert, selbst schuld wenn du nen VW kaufst!\nUnd jetzt runter von der linken Spur!");
			return;
		}

		for (int i = 0; i < rest; i++) {
			geschwindigkeit++;
			System.out.println(geschwindigkeit + " km/h");

			if (geschwindigkeit == 50) {
				System.out.println("Statusmeldung: Ich fahre gerade " + geschwindigkeit + " km/h");
			}
		}
	}

	public void status(int i) {
		if (geschwindigkeit == i) {
			System.out.println("Statusmeldung: Ich fahre genau " + i + " km/h.");
		} else {
			System.out.println("Ich fahre gerade " + geschwindigkeit + " km/h.");
		}
	}

}
