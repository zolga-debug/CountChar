package oop.pm.ueberschreiben.Static;

public class Static {

	public static void main(String[] args) {
		Eltern e1 = new Eltern();
		Kind k1 = new Kind();
		Eltern e2 = new Kind(); // PM

		e1.gibAus();
		k1.gibAus();
		e2.gibAus(); // bei Überschreiben und PM gewinnt immer das Kind, nicht aber bei Klassen-M.
	}

}

class Eltern {
	static void gibAus() {
		System.out.println("In Eltern");
	}
}

class Kind extends Eltern {
//	@Override // CF bei static
	static void gibAus() { // CF bei Instanz-M.
		System.out.println("In Kind");
	}
}