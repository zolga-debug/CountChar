package oop.pm.geschwister;

public class WaermePumpe {
	int leistung;
	int verbrauch;
	int geraeusch;
	public String toString() {
		return "Ich bin eine Wärmepumpe";
	}
}

class Kuehlschrank extends WaermePumpe{ // Spezialisierung
	int kuehlVolumen;
	int gefrierVolumen;
	public String toString() {
		return "Ich bin ein Kühlschrank";
	}
}

class Klimaanlage extends WaermePumpe{
	boolean inverter;
	double scop; // z.B. 4,5 bedeutet: 1 KW Strom erzeugt 4,5 KW Wärme
}

class WaermePumpeTest{
	public static void main(String[] args) {
		Kuehlschrank k1 = new Kuehlschrank();
		k1.leistung=50;
		k1.kuehlVolumen=50;
		
		Klimaanlage c1 = new Klimaanlage();
		c1.inverter=true;
		c1.leistung=3_500;
		c1.scop = 4.5;
		
//		c1 = k1; // CF: sind Geschwister, habe keine is-a - Bez. zueinander (Type mismatch: cannot convert from Kuehlschrank to Klimaanlage)
//		c1 = (Klimaanlage) k1; // befinden sich nicht in einer Vererbungslinie
		
		System.out.println(c1); //  ich bin eine Wärmepumpe => keine eigene toString(), deshalb die geerbte
		System.out.println(k1); // Ich bin ein Kühlschrank
		
		/*WaermePumpeTest.*/transport(k1);
		/*WaermePumpeTest.*/transport(c1);
		
	}
	static void transport(WaermePumpe geraet) { // Polymorphe Durchleitung (WaermePumpe geraet = k1)
		System.out.println("Ich transportiere gerade: "+geraet.getClass().getSimpleName());
	}
}