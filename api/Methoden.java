package api;

public class Methoden {

	public static void main(String[] args) {
		{
			StringBuilder sb = new StringBuilder("Hallo");
			sb.reverse();
			System.out.println(sb);
//		Idee: Online verfügbares Wörterbuch nach Wörtern durchsuchen, die das gleiche Ergebnis liefern, wenn sie von rechts nach links gelesen werden. Palindrom
//		Idee2: wie zuvor, aber mit unterschiedlichem Sinn.

		}
		{
			StringBuilder sb = new StringBuilder("Hallo liebe Welt");
			StringBuilder sbSource = new StringBuilder(sb);

			sb.replace(6, 11, "böse");
			System.out.println(sb);
			String s = sbSource.toString().replace("l", "L");
			sbSource.toString().replace("l", "L"); // toString ändert sb nicht!
			System.out.println(sbSource.toString().replace("l", "L"));
			System.out.println(sbSource);
			sbSource.append("!"); // M. ändert sb-Obj.
//		    @Override
//		    public StringBuilder append(String str) {
//		        super.append(str);
//		        return this;
//		    }
			System.out.println(sbSource);
			System.out.println(s);
//			sbSource = sbSource.toString();
//			sbSource = "Hallo";
//			s = 4;
		}
		{
			StringBuilder sb = new StringBuilder("Hallo");
			sb.insert(0, "Zuerst einmal - ");
			System.out.println(sb);
//			public StringBuilder insert(int offset,
//                    String str)
//
//Inserts the string into this character sequence. 
//Returns:
//    a reference to this object.
		}
		
		System.out.println(sb1.toString().equals(sb2.toString()));  // → true
		 
		Wäre die alternative Lösung es direkt mit dem StringBuilder zu machen
		 
		
		
	} // E
}