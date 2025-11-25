package start;

public class Bloecke_Scope {

	public static void main(String[] args) {
//		Variablen-Gültigkeitsbereich
		int i;
		{
			i=1;
			int k=1;
		} // Garbage Collection (GC)
		
		System.out.println(i);
//		System.out.println(k); // CF
		
		{ 
			int k;
		} // GC
		
		int k;
		
		{
//			int i; // CF: Duplicate local variable i => ReDeclare
		}
	} // EndOfMain

} // EndOfClass
