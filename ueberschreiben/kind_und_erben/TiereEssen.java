package oop.pm.ueberschreiben.kind_und_erben;
class Animal{
	/* private */ void eat() {
		System.out.println("1.) Tiere essen um zu leben.");
	}
}
class Horse extends Animal{
	void eat() {
		System.out.println("2.) Pferde essen am liebsten Heu.");
	}
	void eat(int i) {
		System.out.println("3.) Pferde essen am liebsten "+i+" Ballen Heu am Tag.");
	}
}
public class TiereEssen {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Horse horse = new Horse();
		Animal animal2 = new Horse(); // analog zu toString() in Cabrio
		
		horse.eat(); // 2.
		animal.eat(); // 1.
		animal2.eat(); // 2. 
		
//		animal.eat(30000000); // line 1: CF: Eltern kennen ihre Kinder nicht.
		horse.eat(30_000_000); // OK bei HeuBällchen
//		animal2.eat(30000000); // line 2: Überladung und keine Überschreibung (s.a. line 1)
		((Horse) animal2)    .eat(30000000); // wg. Priorität
		
	}

}
