package funky.ist_pos;



public class IsPos {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie ein funk. Interf. (isPos) mit der Methode m.
	//  Sie soll eine ganze Zahl nehmen und einen Wahrheitswert zurück geben:
//	    true, wenn die Zahl positiv ist - andernfalls false.
//	    Die Referenz sei go.
		
		
		 isPos go = (num)-> {
		 if (num < 0) return false;
		 return true;
		 };
		 
		System.out.println(go.m(5));
		System.out.println(go.m(-5));
		
		
		
	}
	@FunctionalInterface
 interface isPos {
	boolean m (int num);
}
	}


