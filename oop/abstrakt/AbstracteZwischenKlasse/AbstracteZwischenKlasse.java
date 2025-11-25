package oop.abstrakt.AbstracteZwischenKlasse;

public class AbstracteZwischenKlasse {
	public static void main(String[] args) {
//		new Kind();
		Kind k = new Enkel(); // Kind hat keine eigene M., aber m von Eltern geerbt
		k.m();	// tricky: wg. PM: Enkel
		}

}

class Eltern {
	void m() {
		System.out.println("Eltern");
	}
}

abstract class Kind extends Eltern {
}

class Enkel extends Kind {
	void m() {
		System.out.println("Enkel555");
	}
}