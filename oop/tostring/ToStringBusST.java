package oop.tostring;

public class ToStringBusST {
	public static void main(String[] args) {
		Bus neuerBus = new Bus();
		neuerBus.name = "FlixBus";
		neuerBus.sitzplatzAnzahl = 56;
		System.out.println (neuerBus);
	}
}
 
class Bus {
	String name;
	int power;
	int sitzplatzAnzahl;
	
   

	
	public void setSitzplatzAnzahl(int sitzplatzAnzahl) {
		this.sitzplatzAnzahl = sitzplatzAnzahl;
	}

public String toString() {
	   return "Der Bus Name: " + name + "\ner hat Anzahl der Sitzplätze - "+ sitzplatzAnzahl;
   }
}
 