package oop.abstrakt.AbstrakteMethode;

public class AbstrakteMethode {

}
abstract class Tier{ // Enthält eine Klasse min. eine abstrakte M., dann muss die Kl. auch als abstract gekennzeichnet werden.
	abstract void essen(); // keinen Body => sagt, WAS gemacht werden soll. 
}
class Hund extends Tier{
//	void essen() {} // über das WIE bestimmt überschreibende M. (implementieren)
}

class NixObjekt{
	public static void main(String[] args) {
		new Tier(); // Instanziieren ist nicht mögl. => können keine Objekte bauen.
	}
}