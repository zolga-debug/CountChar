package oop.Interface.mehrfachvererbung.isa;

interface Fahren{}
class Auto implements Fahren{}
class Cabrio extends Auto{}

// Klassen müssen sich in einer Vererbungslinie befinden

public class IsA {

	public static void main(String[] args) {
		System.out.println(new Cabrio() instanceof Fahren);
		Fahren komisch = new Cabrio(); // PM
	}

}
