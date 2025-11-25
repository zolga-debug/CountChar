package oop.konstruktoren;

public class KonstruktorenKK {

	public static void main(String[] args) {
//		Technologie-Offenheit:
//		https://www.zdf.de/video/shows/mai-think-x-die-show-102/maithink-x-sendung35-efuels-vs-eauto-100
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Susi");
		Auto auto3 = new Auto('B'); // Antriebsart
		Auto auto4 = new Auto("Otto", 'D');

		// Ausgabe
		System.out.println(auto1.toString());
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(auto4);
	}
}

class Auto { // Konstruktor-Überladung (versch. Parameter-Listen)
	String name;
	char antriebsKonzept; // E = E-Auto, D = Diesel, B = Benzin

	public Auto() {
//		this.name = "Unbekannt"; // später bei Chaining
//		this.antriebsKonzept = 'B'; // KBA
	}

	public Auto(String name) { // 
		this.name = name;
//		this.antriebsKonzept = 'B'; // später bei Chaining
	}

	public Auto(char antriebsKonzept) {
		this.name = "Unbekannt";
		this.antriebsKonzept = antriebsKonzept;
	}

	public Auto(String name, char antriebsKonzept) {
		this.name = name;
		this.antriebsKonzept = antriebsKonzept;
	}

	public String toString() {
		String antrieb;
		switch (antriebsKonzept) {
		case 'E':
			antrieb = "Elektro-Motor";
			break;
		case 'D':
			antrieb = "Diesel-Motor";
			break;
		case 'B':
			antrieb = "Benzin-Motor";
			break;
		default:
			antrieb = "unbekannter Antrieb"; // CNG, LNG, H (verbrennen oder Brennstoffzelle)
			break;
		}
		return "Ich bin ein Auto mit " + antrieb + " und heiße " + name + ".";
	}
}
