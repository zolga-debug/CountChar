package funky;
interface FunkInt{
	void mini();
}
public class Anonyme {

	public static void main(String[] args) {
		System.out.println("Anonyme Klasse mit Interface-Ref.");
		FunkInt fi = new FunkInt() {
			@Override
			public void mini() { // M. i.d. anonymen Klasse überschreibt / implementiert Interface-M.
				System.out.println("In anonymer Klasse (überschreibt Interface-M.");
			}
		};
		fi.mini();
		
		System.out.println("jetzt mit Lambda");
		fi = () -> System.out.println("Jetzt mit Lambda-Ausdruck.");
		fi.mini();
		
		
		System.out.println("Anonyme Klasse mit Ref. von abstr. Klasse");
		Klasse ak = new Klasse() { // CF wenn leer: The type new Klasse(){} must implement the inherited abstract method Klasse.maxi()
			@Override
			void maxi() {
				System.out.println("In anonymer Klasse (überschreibt M. in abstr. K.");
			}
		};
		ak.maxi();
		
		
		Konkret kakl = new Konkret() {
			@Override
			void middle() {
				System.out.println("In anonymer Klasse (überschreibt M. in konk. K.");
			}
		};
		kakl.middle();
		
	} // eom

}
// Übung: Bitte schreiben Sie eine abstracte Klasse (Name=Klasse) mit einer abstr. M. (Name= maxi()), die nichts nimmt und nichts gibt.
abstract class Klasse{
	abstract void maxi();
}
class Konkret{
	void middle() {}
}
