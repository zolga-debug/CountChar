package oop.pm.ueberschreiben.kind_gewinnt;

public class CabrioToString {

	public static void main(String[] args) {
		Auto Objekt = new Cabrio(); // PM
		System.out.println(Objekt); // Kind gewinnt immer, wenn bei PM überschreiben wird.
		Object obj = Objekt; // PM
		System.out.println(obj); // Kind gewinnt
	}

}
class Auto extends Object{
	public String toString() {
		return "Auto";
	}
}
class Cabrio extends Auto{
	public String toString() {
		return "Cabrio";
	}
}
