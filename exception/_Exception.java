package exception;
class Eltern{}
class Kind extends Eltern{}
public class _Exception {

	public static void main(String[] args) {
		Eltern e = new Eltern();
//		Kind k = e; // CF: 
		Kind k = (Kind) e; // kein CF aber CCE (ClassCastException: exception.Eltern cannot be cast to exception.Kind)
		
		Eltern eltern = new Kind(); // PM
		
//		Kind k1 = eltern; // CF
		Kind k1 = (Kind) eltern; // downcast
		System.out.println("Ferig");
	}

}
