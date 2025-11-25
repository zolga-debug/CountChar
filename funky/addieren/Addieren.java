package funky.addieren;

public class Addieren {

	public static void main(String[] args) {
		//Übung: Bitte schreiben Sie ein funktionales Interface FunkInt, dass 2 Zahlen nimmt und die Summe in der Console ausgibt 
//		(KEIN return sondern syso)
//	    Erstellen Sie dazu den Lambda-Ausdruck und rufen Sie die M. mini() auf.
		
		 
		
		FunkInt go;
		go = (quatschMitSauce, quatschMitBrei) -> System.out.println(quatschMitSauce+quatschMitBrei);
		go.mini(5,3);
	}
		interface FunkInt{
		void mini(int a, int b); 	
		}
	}