package oop.kind_eltern_plus_getClass;

public class KindElternPlusGetClass {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1);
		System.out.println(a1.name);
		
		Cabrio c1 = new Cabrio();
		c1.name="Ich bin ein Cabrio";
		c1.dachOffen=true;
		System.out.println(c1.name);
		System.out.println(c1);
	}

}
class Auto{
	String name;
	int geschwindigkeit;
	
	@Override // beschützt uns durch CF bei fehlerhaftem Überschreiben
	public String toString() { // überschreibt toString() in Object
		return "Ich bin ein "+getClass().getSimpleName(); 
	}
}

class Cabrio extends Auto{ // Kind kann alles, was Eltern kann und noch mehr
	boolean dachOffen;
	
	@Override
//	public String toString() {
//		return super.toString()+" und das Dach ist gerade "; // Übung: bitte realisieren Sie die 
//		//Ausgabe: ... und das Dach ist gerade geöffnet bzw. geschlossen 
//		
	
		public String toString() {
			return super.toString()+" und das Dach ist gerade "+ (dachOffen ?"offen" :"geschlossen");
	}
}
