package methoden;

public class PassBy {

	public static void main(String[] args) {
		int i = 1; // line 1
		System.out.println(i); // 1
		integer(i);
//		System.out.println(integer(i)); // 2
		System.out.println(i); // 1, da i aus line 1 nicht verändert wird
		
		int[] intArray = {0};
		System.out.println("Vor M.: "+intArray[0]);
		array(intArray);
		System.out.println("Nach M.: "+intArray[0]); // 1
		
		Integer hallo = 0;
		wrapper(hallo);
		System.out.println(hallo);
		
		String string = "Hallo";
		imMutable(string);
		System.out.println(string);
		
		String String; // sehr schlechte Idee, auch wenn Identifier syntaktisch OK ist
	}

	static int Integer(int i) { // sehr schlechte Idee, auch wenn Identifier syntaktisch OK ist
		return i + 1;
	}
	static void integer(int i) { // passByValue
		i++;
	} // GC
//	static int integer(int i) { // passByValue
//		return i + 1;
//	}
	static void array(int[] ia) { // passByReference (versch. Var.-Namen)
		ia[0]++;
	}
	
	static void wrapper(Integer i) {
		i=i+1;
	}
	
	static void imMutable (String s) {
		s=s+" Welt";
	}
}
