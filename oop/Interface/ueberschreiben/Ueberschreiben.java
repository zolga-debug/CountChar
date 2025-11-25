package oop.Interface.ueberschreiben;

public class Ueberschreiben {

}

interface Fahren {
	void fahren(); // Sichtbarkeit in Interfaces ist immer public
}

class Auto implements Fahren {
	public void fahren() { // "default" = package private
		System.out.println("rollen");
	}
}

class Ballon implements Fahren {
	public void fahren() { // "default" = package private
		System.out.println("schweben");
	}
}
