package oop.getter_setter;

public class GetterSetterIDE {

//Übung: Bitte schreiben Sie eine toString() für die Klasse Bus.
//	Es soll der Name und die Sitzplatzanzahl angezeigt werden.
//Testen Sie es anschl. in der main
	public static void main(String[] args) {

	}
}

class Bus {
	String name;
	int power;
	int sitzplatzAnzahl;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setSitzplatzAnzahl(int sitzplatzAnzahl) {
		this.sitzplatzAnzahl = sitzplatzAnzahl;
	}
	


}