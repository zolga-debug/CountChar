package oop.pm.ueberschreiben.FinalMethode;

public class Final {

}
class Animal{
	final void eat() { // darf nicht überschrieben werden (z.B. sichere M. void password(...){...})
		System.out.println("1.) Tiere essen um zu leben.");
	}
	void eat(int i) {
		System.out.println("3.) Pferde essen am liebsten "+i+" Ballen Heu am Tag.");
	}
}
class Horse extends Animal{
	void eat() {
		System.out.println("2.) Pferde essen am liebsten Heu.");
	}
}