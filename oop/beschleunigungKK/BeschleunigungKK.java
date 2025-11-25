package oop.beschleunigungKK;

public class BeschleunigungKK {
	public static void main(String[] args) {
		Auto a1 = new Auto();

		System.out.println(a1.geschwindigkeit + " km/h");
		a1.beschleunigen();
		System.out.println(a1.geschwindigkeit + " km/h");
		a1.beschleunigen();
	}
}

class Auto {
	int geschwindigkeit = 0;
	int maxGeschwindigkeit = 160;

	void beschleunigen() {
		int rest = maxGeschwindigkeit - geschwindigkeit; // YAGNI
		if (rest <= 0) {
			System.out.println(
					"Elektrische Drosselung aktiviert, selbst schuld wenn du nen VW kaufst!\nUnd jetzt runter von der linken Spur!");
			return;
		}

		for (int i = 0; i < rest; i++) {
			geschwindigkeit++;
			System.out.println(geschwindigkeit + " km/h");
		}

	}

}
