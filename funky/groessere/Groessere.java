package funky.groessere;



public class Groessere {

	public static void main(String[] args) {
		
	//  Übung: Bitte schreiben Sie ein funktionales Interface FunkInt mit der Methode groessere().
	//  Sie soll 2 Zahlen nehmen und die größere zurück geben.
	//  Testen Sie dann Ihr Programm durch Test-Aufrufe.
		FunkyInt max = (a,b) -> a >= b ? a : b;
		System.out.println(max.groessere(9, 8));
			
         
	}

    interface FunkyInt {
        int groessere(int a, int b);
    }
}

		
		
		
		



