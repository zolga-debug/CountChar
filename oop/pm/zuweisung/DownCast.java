package oop.pm.zuweisung;
class Auto{}
class Cabrio extends Auto{boolean dachOffen;}

public class DownCast {

	public static void main(String[] args) {
		Auto a1 = new Cabrio(); // PM
//		System.out.println(    a1.dachOffen    ); // CF
//		System.out.println( ( (Cabrio)  a1  )  .dachOffen    ); // Priorität durch klammern erhöhen
		
//		Übung: Bitte zeigen Sie den Dach-Status von Cabrios mit einer Schleife an.
		
		Auto[] autos = {new Auto(),new Cabrio(),new Cabrio()};
		for (Auto auto : autos) {
			if (auto instanceof Cabrio) {
				System.out.println((( Cabrio)auto).dachOffen);
			}else {
				System.out.println("Das ist kein Cabrio");		
			}
		}
		
	}

}
