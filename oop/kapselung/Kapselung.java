package oop.kapselung;

public class Kapselung {
	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.geschwindigkeit=100;
//		a1.name="Otto"; // CF: The field Auto.name is not visible
		a1.setName("Otto");
		System.out.println("Hallo "+a1.getName());// methode verwenden getName()weil name Privat ist
	}
}
class Auto{
	private String name; // private NUR in dieser Klasse sichtbar
	int geschwindigkeit;
	public String v2g;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void anhalten() {
		while (geschwindigkeit>0) bremsen();		
	}
	private void bremsen() { // nur als Bsp. nicht realitätsnah
		geschwindigkeit--; // nicht abgesichert
	}
}