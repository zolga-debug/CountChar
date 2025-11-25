package array;

public class UebungChararray {

	public static void main(String[] args) {
		{
		// Übung:
		//  Bitte fügen Sie den Inhalt des char-Arrays zu einem String zusammen und geben diesen anschließend in der Console aus
		    char[] zeichenArray = { 'H', 'a', 'l', 'l', 'o' }; // Deklaration, Instanziierung und Initialisierung eines Arrays in einer PRG-Zeile.
		    String zeichenKette = ""; // line 1: Leerstring
		    System.out.println(zeichenKette.length());
		    System.out.println(zeichenKette.isEmpty());
		//  hier kommt Ihre Lösung hin
            for (char buschtabe : zeichenArray) {
            	zeichenKette += buschtabe;
            	}
            System.out.println("String: " + zeichenKette);
		}
            {  System.out.println("-------");
            char [] zeichenArray = {'H' , 'a' , 'l', 'l', 'o'};
    		String zeichenKette = "";
    		
    		for (int i = 0; i < zeichenArray.length; i++) {
    			zeichenKette += zeichenArray[i];
    		}
    		System.out.println(zeichenKette);
            }
            {  System.out.println("---KK----");
           char[] zeichenArray = { 'H', 'a', 'l', 'l', 'o' };
       	
       	String zeichenKette = "";
//       	System.out.println(zeichenKette.length());
//       	System.out.println(zeichenKette.isEmpty());
       	zeichenKette = new String(zeichenArray);// API: Konstruktor erledigt für uns die Arbeit
       	System.out.println(zeichenKette);
            }   
    		{
    			System.out.println("==== CB; DA ====");
    			char[] zeichenArray = { 'H', 'a', 'l', 'l', 'o' };
    		    String zeichenKette = "";
    		    
    		    for (char zeichen : zeichenArray) {
    		    zeichenKette += zeichen;
    		    }
    		    System.out.println(zeichenKette);
    		 
    		}
    		{
    			System.out.println("==== AK ====");
    			char [] zeichenArray = {'H','a','l','l','o'};
    			String zeichenKette = "";
    			
//    			Gegenüberstellung von drei versch. Lösungen
    			String zeichenKette2 = String.valueOf(zeichenArray);
    			String zeichenKette3 = new String(zeichenArray);
    			for (char c : zeichenArray) {
    				zeichenKette += c;			
    			}
    			System.out.println(zeichenKette);
    			System.out.println(zeichenKette2);
    			System.out.println(zeichenKette3);
    	 
    		}
    		{
    			System.out.println("=== Die absolute Minimal-Version ===");
    			char [] zeichenArray = {'H','a','l','l','o'};
    			System.out.println(zeichenArray);
    		}
		}//end

	}


