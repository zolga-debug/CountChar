package funky.int_parameter;

interface FunkInt{ // FunctionalInterface
	void mini(String s);
}

public class IntParameter {

	public static void main(String[] args) {
//		int i;
//		i=0;
//		i=1;
//		
//		FunkInt go;
//		go = (k) -> System.out.println("Es wurde "+k+" übergeben.");
//		go.mini(i);
//		
//		go = (kartoffelSalat) -> System.out.println("M.-Body überschrieben / ersetzt.");
//		go.mini(2_000);
//		
//		go = (int NudelSalat) -> System.out.println("M.-Body wieder überschrieben / ersetzt.");
//		go.mini(0);
		
		FunkInt go;		
		go = (text) -> System.out.println("Die Laenge "+text+" ist: "+ text.length());		
		go.mini("Hallo");
		
		
	}
}
// Übung: Bitte schreiben Sie ein funktionales Interface FunkInt mit der M. mini(), die einen String nimmt und die Länge des Strings in der Konsole ausgibt. Der Rückgabetyp sei void.
//Rufen Sie dann in der main() diese Methode auf und übergeben ihr Hallo.
