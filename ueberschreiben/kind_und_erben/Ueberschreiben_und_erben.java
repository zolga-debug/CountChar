package oop.pm.ueberschreiben.kind_und_erben;

public class Ueberschreiben_und_erben {

	public static void main(String[] args) {
		Eltern e1 = new Eltern();
		Kind k1 = new Kind();
		Eltern e2 = new Kind(); // PM
		
		e1.gibAus();
		k1.gibAus();
		e2.gibAus(); // bei Überschreiben und PM gewinnt immer das Kind
		k1.machWas();
		e2.machWas();
	}

}
class Eltern{
	void gibAus() {
		System.out.println("In Eltern");
	}
	void machWas() {
		System.out.println("Ich mach' was.");
	}
}
class Kind extends Eltern{
	void gibAus() {
		System.out.println("In Kind");
	}
}