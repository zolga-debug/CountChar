package funky.rueckgabe;
interface FunkInt{
	int mini();
}
public class Rueckgabe {

	public static void main(String[] args) {
		FunkInt go = () -> /* return */ 2;
		System.out.println(go.mini());
	}

}
//Übung: Bitte geben Sie eine Zufallszahl zw. 1 und 6 (inkl. d. Grenzen) zurück.
// Erstellen Sie dazu das funktionale Interface FunkInt mit der M. mini(), die nichts nimmt und ein int zurück gibt.
// Die Ausgabe soll i.d. Console erscheinen.