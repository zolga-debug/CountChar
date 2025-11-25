package api;

public class Konstruktoren {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hallo");
//		Constructs a string builder initialized to the contents of the specified string. The initial capacity of the string builder is 16 plus the length of the string argument.
//	    public StringBuilder(String str) {
//	        super(str.length() + 16);
//	        append(str);
//	    }
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.length());
		String s = "Hola";
		StringBuilder sb3 = new StringBuilder(s);
		System.out.println(sb3);
		StringBuilder sb4 = new StringBuilder(sb1); // wg. toString()
		System.out.println(sb4);
		StringBuilder sb5 = new StringBuilder(100_000_000);
//		StringBuilder sb6 = new StringBuilder(Integer.MAX_VALUE); // OutOfMemoryError: Requested array size exceeds VM limit
//		new StringBuilder().MAXVALUE;
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		/*
		 * Übung: Bitte erstellen Sie eine Variable mit Namen alpha, die das Alphabet von a bis z enthält abcde...z Die Variable soll durch eine Schleife (26 Durchläufe) das Alphabet erhalten. Die Variable ist zu Beginn leer (String alpha = "";) Bitte mit der Klasse String realisieren.
		 */
		{
			System.out.println("=== AK ===");
			String alpha = "";

			for (int i = 97; i <= 122; i++) {
				alpha += (char) i;
			}
			System.out.println(alpha);
		}
		{
			System.out.println("=== ST ===");
			String alpha = "";
			
			for (int i = 0; i < 26; i++) {
				
				alpha += (char) ('a' + i);
			}
			
			System.out.println(alpha.toUpperCase());
	 
		}
		{
			System.out.println("=== CB ===");
			String alpha = "";
			for (char ch = 'a' ; ch <= 'z' ; ch++) {
				alpha += ch;
			}
		}
//		Übung: Nun mit StringBuilder
		{
			System.out.println("=== ST ===");
		StringBuilder alpha = new StringBuilder("");
		
		for (char c = 'a'; c <= 'z'; c++) {
			
			alpha.append(c).append("|");
		}
		
		System.out.println(alpha);
		}
		{
			System.out.println("=== ST ===");
			StringBuilder beta = new StringBuilder();
			for (char ch = 'a' ; ch <= 'z' ; ch++) {
				beta.append(ch);
			}
	 new StringBuffer();
		}
	} // E

}
