package oop.abstrakt.HundWalAdler;

public class HundWalAdler {

}
abstract class Tier{
/* "default"*/ abstract void move(); // evtl. Kind-Klassen werden gezwungen move() zu implementieren.
}

class Hund extends Tier{
/*protected*/ /*private*/ /*public*/	void move() { // CF: bei private: Cannot reduce the visibility of the inherited method from Tier
		System.out.println("rennt");
	}
}
//Sichtbarkeiten:
//	public
//	protected
//	"default"
//	private

class Wal extends Tier{
	public void move() {
		System.out.println("schwimmt");
	}
}
class Adler extends Tier{
	protected void move() {
		System.out.println("fliegt");
	}
}

