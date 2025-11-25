package funky.ist_gerade;

public class IstGerade {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie ein funk. Interf. (isGerade) mit der Methode m.
	//  Sie soll eine ganze Zahl nehmen und einen Wahrheitswert zurück geben:
//	    true, wenn die Zahl gerade ist - andernfalls false.
//	    Die Referenz sei go.
		isGerade go = (num)->
		 num%2==0 ;
		 
		System.out.println(go.m(5));
		System.out.println(go.m(12));
		
		
		
	}
interface isGerade {
	boolean m (int num);
}
}
