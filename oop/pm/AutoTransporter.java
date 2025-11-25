package oop.pm;

public class AutoTransporter {

	public static void main(String[] args) {
//		Übung: Bitte speichern Sie Autos in einem Auto-Array und Cabrios in einem Canrio-Array.
		Auto[] autos = {new Auto(), new Auto(), new Auto() };
		Cabrio[] cabrios = {new Cabrio(), new Cabrio(), new Cabrio() };
	
		Auto[]autoTransporter = {new Auto(), new Cabrio()}; //Polymorphie
	}

}
class Auto{}
class Cabrio extends Auto{}