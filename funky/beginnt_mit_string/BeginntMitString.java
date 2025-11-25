package funky.beginnt_mit_string;

public class BeginntMitString {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie ein funk. Interf. mit der Methode m.
	//  Sie soll zwei Strings nehmen und einen Wahrheitswert zurück geben:
//	    true, wenn der erste String mit dem zweite String beginnt - andernfalls false.
				
				beginntString bs = (a, b) -> b.startsWith(a);
				beginntString bs1 = (a,b) -> b.substring(0,1).equals(a.substring(0,1));
				
				System.out.println(bs.m("Hallo", "Hallo Welt"));
				System.out.println(bs1.m("Hallo", "Hallo Welt"));
		System.out.println("============hhh======================");
		
				FunkInt fi = (s1, s2) -> s1.startsWith(s2);
				
				String string1 = "HalloWelt";
				String string2 = "Hallo";
				String string3 = "Tschüss";
				
				System.out.println(fi.m(string1, string2));
				System.out.println(fi.m(string2, string3));
				
		System.out.println("==================================");
          
		
		Schtrinks schtrinks = (s3, s4) -> s3.startsWith(s4);
		
		String schtring1 = "testTotal";
		String schtring2 = "test";
		
		System.out.println("Beginnt \"" + schtring1 + "\" mit \"" + schtring1 + "\"?" + 
		(schtrinks.startsWith(schtring1, schtring2) ? " JA!" : " NEIN!"));
	}
	
			
	
		 interface beginntString{
			boolean m(String a, String b);
		}
		 interface FunkInt{
				boolean m (String s1, String s2);
		}
		 interface Schtrinks {
	      boolean startsWith (String s3, String s4);
	 
}
}	 
	


