package oop.pm.ueberschreiben.variablen;
//@formatter:off
class Auto {String name = "Susi";}
class Cabrio extends Auto{String name = "Otto";} // so nicht(!) progr. Ist nur relevant f. OCA-Prüfung
//@formatter:on
public class Variablen {

	public static void main(String[] args) {
		Cabrio cabrio = new Cabrio();
		Auto auto = new Auto();
		Auto auto2 = new Cabrio(); // PM
		
		System.out.println(cabrio.name); // Otto
		System.out.println(auto.name); // Susi
		System.out.println(auto2.name); // Susi => Es gewinnt "immer" der Referenz-Type, ausser beim Überschreiben von Instanz-M.
	}

}
