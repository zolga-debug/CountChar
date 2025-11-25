package oop.pm.ueberschreiben.kind_gewinnt;

public class Kind_gewinnt {

	public static void main(String[] args) {
		Eltern e1 = new Eltern();
		Kind k1 = new Kind();
		Eltern e2 = new Kind(); // PM

		e1.gibAus();
		k1.gibAus();
		e2.gibAus(); // bei Überschreiben und PM gewinnt immer das Kind
	}

}

class Eltern {
	void gibAus() {
		System.out.println("In Eltern");
	}
}

class Kind extends Eltern {
	@Override // IDE hilft mit Autovervollständigung bei korrektem Überschreiben (s.a. line 1)
	protected void gibAus() { // line 1: bei gibaus KEIN Überschreiben. 
		System.out.println("In Kind");
	}
}