package funky.String_parameterNRDA;

//Übung: Bitte schreiben Sie ein funktionales Interface FunkInt mit der M. mini(), die einen String nimmt und die Länge des Strings in der Konsole ausgibt. Der Rückgabetyp sei void.
//Rufen Sie dann in der main() diese Methode auf und übergeben ihr Hallo.

interface FuncInt{
	void mini(String laenge);
}

public class FunkyfunkfunNRDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInt l;
		l = (laenge) -> System.out.println("Die Länge des Strings beträgt " + laenge.length() + " Zeichen");
		l.mini("blabliblubb");
	}

}

//interface FunkInt{
//	void mini(String s); 	
//}
// 
//public class IntParameter {
// 
//	public static void main(String[] args) {
//		
////		String s = "Hallo";
//		
//		FunkInt go;
//		go = (quatschMitSauce) -> System.out.println(s.length());
//		go.mini(s);
//	}
//}
 