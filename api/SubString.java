package api;

public class SubString {

	public static void main(String[] args) {
		//@formatter:off      
                      // 01234567
		String string = "animals";
//@formatter:on

		System.out.println(string.substring(3));

//	    public String substring(int beginIndex) {
//	        if (beginIndex < 0) {
//	            throw new StringIndexOutOfBoundsException(beginIndex);
//	        }
//	        int subLen = value.length - beginIndex;
//	        if (subLen < 0) {
//	            throw new StringIndexOutOfBoundsException(subLen);
//	        }
//	        return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);
//	    }

//		String(byte[] bytes, int offset, int length)

		System.out.println("Hallo".substring(2));

		System.out.println("Hallo".substring(1, 2)); // exclusive
		System.out.println("Hallo".substring(1, 1) + "!"); //
		System.out.println("Hallo".substring(1, 1).isEmpty()); //

//	    public String substring(int beginIndex, int endIndex) {
//	        if (beginIndex < 0) {
//	            throw new StringIndexOutOfBoundsException(beginIndex);
//	        }
//	        if (endIndex > value.length) {
//	            throw new StringIndexOutOfBoundsException(endIndex);
//	        }
//	        int subLen = endIndex - beginIndex;
//	        if (subLen < 0) {
//	            throw new StringIndexOutOfBoundsException(subLen);
//	        }
//	        return ((beginIndex == 0) && (endIndex == value.length)) ? this
//	                : new String(value, beginIndex, subLen);
//	    }
		{
			// Übung:
			// Bitte speichern Sie den Vornamen aus name in vorname und den Nachnamen in nachname.
			// Das PRG soll für ALLE Vor- und Nachnamen funktionieren.
			// Bitte verwenden Sie uns bekannte sinnvolle String-Methoden.
			// Tipp:
			// Vorname beginnt bei 0 und endet vor dem Komma
			// Vorname endet vor dem Komma
			// Komma-Position ist flexibel, abhängig von der Länge der Vornamen.
			String name = "Hans, Meier";
			// String name = "Hans, Meier ";

			String nachname; // Meier (ohne Komma und Leerzeichen)
			String vorname; // Hans (ohne Komma und Leerzeichen)
		}
		{
			System.out.println("=== KK ===");
			String name = "Kevin, Koenig";

			int kommaPosition = name.indexOf(",");

			String vorname = name.substring(0, kommaPosition).trim();
			String nachname = name.substring(kommaPosition + 1).trim();

			System.out.println("!" + vorname + "!");
			System.out.println("!" + nachname + "!");
		}
		{
			System.out.println("=== AK ===");
			String name = "Hans, Meier";
			String nachName = name.substring(name.indexOf(",") + 1, name.length()).trim();
			String vorName = name.substring(0, name.indexOf(",")).trim();

			System.out.println(nachName + ", " + vorName);
			System.out.println("!" + vorName + "!");
			System.out.println("!" + nachName + "!");

		}
		{
			System.out.println("=== ST ===");
			String name = "Hans, Meier";
			int komma = name.indexOf(',');

			String vorName = name.substring(0, komma).trim();

			String nachName = name.substring(komma + 1).trim();

			System.out.println("Vorname : " + vorName + "\nNachname : " + nachName);

			System.out.println("!" + vorName + "!");
			System.out.println("!" + nachName + "!");
		}

		{
			// Übung
			String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
					"     Klaus   ,   Schulze   " };
			String[] vornameArray = new String[nameArray.length];
			String[] nachnameArray = new String[nameArray.length];

//    ==========================================
//    Übung:
//    Bitte Schreiben Sie alle Vornamen in ein Vornamen-Array und alle Nachnamen in ein Nachnamen-Array
//    Der Index sei jeweils für eine Person gleich, damit durch vornameArray[0]+" "+nachnameArray[0] 
//    immer dieselbe Person angezeigt wird.

//    hier kommt ihr PRG-Code hin

			System.out.println("Hallo " + vornameArray[0] + " " + nachnameArray[0] + ", wie geht es Dir?");
		}
		
		
		{
			System.out.println("=== ST ===");
			String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
			"     Klaus   ,   Schulze   " };
			String[] vornameArray = new String[nameArray.length];
			String[] nachnameArray = new String[nameArray.length];
			for (int i = 0 ; i < nameArray.length; i++) {
				String name = nameArray[i];
				int komma = name.indexOf(',');
				
				String vorName = name.substring(0, komma).trim();
				String nachName = name.substring(komma + 1).trim();
				
				vornameArray[i] = vorName;
				nachnameArray[i] = nachName;
			}
			System.out.println("Hallo " + vornameArray[0] + " " + nachnameArray[0] + ", wie geht es Dir?");
			System.out.println("Hallo " + vornameArray[1] + " " + nachnameArray[1] + ", wie geht es Dir?");
			System.out.println("Hallo " + vornameArray[2] + " " + nachnameArray[2] + ", wie geht es Dir?");
			System.out.println("Hallo " + vornameArray[3] + " " + nachnameArray[3] + ", wie geht es Dir?");
		}
		{
			System.out.println("=== KK ===");
			String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
			"     Klaus   ,   Schulze   " };
			String[] vornameArray = new String[nameArray.length];
			String[] nachnameArray = new String[nameArray.length];
	        for (int i = 0; i < nameArray.length; i++) {
	            String[] teileName = nameArray[i].split(","); // tricky: API-Methode zum Trennen verwenden 
	            vornameArray[i] = teileName[0].trim();     // Teil vor dem Komma, ohne Leerzeichen
	            nachnameArray[i] = teileName[1].trim();    // Teil nach dem Komma, ohne Leerzeichen
	            
	        }
	            for (int i = 0; i < nameArray.length; i++) {
	                System.out.println("Hallo " + vornameArray[i] + " " + nachnameArray[i] + ", wie geht es Dir?");
		}}
	            {
	            	System.out.println("=== AK ===");
	        		String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
	        		"     Klaus   ,   Schulze   " };
	        		String[] vornameArray = new String[nameArray.length];
	        		String[] nachnameArray = new String[nameArray.length];
	        		
	        		for (int i = 0; i < nameArray.length; i++) {
	        			vornameArray[i] = nameArray[i].substring(0, nameArray[i].indexOf(",")).trim();
	        			nachnameArray[i] = nameArray[i].substring(nameArray[i].indexOf(",")+1, nameArray[i].length()).trim();
	        		}
	        		
	        		for (int i = 0; i < nachnameArray.length; i++) {
	        			System.out.println("Hallo " + vornameArray[i] + " " + nachnameArray[i] + ", wie geht es Dir?");
	        		}
	         
	            }
	            {
	            	System.out.println("=== DA ===");
	            	String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
	            	"     Klaus   ,   Schulze   " };
	            	String[] vornameArray = new String[nameArray.length];
	            	String[] nachnameArray = new String[nameArray.length];
	            	for(int i = 0 ; i < nameArray.length ; i++) {
	    				String kompletterName = nameArray[i];
	    				String kompletterNameformatiert = kompletterName.replace(" ", "").replace("\t", "");
	    				int indexKomma = kompletterNameformatiert.indexOf(',');
	    				String vorname = kompletterNameformatiert.substring(0, indexKomma);
	    				String nachname = kompletterNameformatiert.substring(indexKomma+1);
	    				vornameArray[i]  = vorname;
	    				nachnameArray[i] = nachname;
	    			}
	     
	            }
	            {
	            	System.out.println("=== TS ===");
	            	String[] nameArray = { "Hans, Meier", "Helga, Kruse", "Hansine     ,   \t   Meierichkeit",
	            	"     Klaus   ,   Schulze   " };
	            	String[] vornameArray = new String[nameArray.length];
	            	String[] nachnameArray = new String[nameArray.length];
	            	for(int zaehler = 0; zaehler < nameArray.length; zaehler++) {
	    				
	       			 vornameArray[zaehler] = nameArray[zaehler].substring(0, nameArray[zaehler].indexOf(",")).trim();
	       		     nachnameArray[zaehler] = nameArray[zaehler].substring(nameArray[zaehler].indexOf(",") + 1).trim();
	       			  
	       		System.out.println("Hallo " + vornameArray[zaehler] + " " + nachnameArray[zaehler] + ", wie geht es Dir?"); // Ausgabe mit in der Schleife
	       			}
	        
	            }
	            
	            {
//	          ==========================================
//	          Übung:
//	          Bitte Schreiben Sie alle Vornamen in ein Vornamen-Array und alle Nachnamen in ein Nachnamen-Array
//	          Der Index sei jeweils für eine Person gleich, damit durch vornameArray[0]+" "+nachnameArray[0] 
//	          immer dieselbe Person angezeigt wird.

	            	String[] nameArray = { "Meier, Hans", "Kruse, Helga", "Meierichkeit     ,   \t   Hansine",
	            	"     Schulze   ,   Klaus   " };
	    			String[] vornameArray = new String[nameArray.length];
	    			String[] nachnameArray = new String[nameArray.length];
	    			
//	          hier kommt ihr PRG-Code hin
	    			
	    			
	      			System.out.println("Hallo " + vornameArray[0] + " " + nachnameArray[0] + ", wie geht es Dir?");
	      		}
	      		
	      		
	      		{
	      			System.out.println("=== AK ===");
	      			String[] nameArray = { "Meier, Hans", "Kruse, Helga", "Meierichkeit     ,   \t   Hansine",
	      			"     Schulze   ,   Klaus   " };
	      			String[] vornameArray = new String[nameArray.length];
	      			String[] nachnameArray = new String[nameArray.length];
	    			for (int i = 0; i < nameArray.length; i++) {
	    				nachnameArray[i] = nameArray[i].substring(0, nameArray[i].indexOf(",")).trim();
	    				vornameArray[i] = nameArray[i].substring(nameArray[i].indexOf(",") + 1, nameArray[i].length()).trim();
	    			}
	    			
	    			for (int i = 0; i < nachnameArray.length; i++) {
	    				System.out.println("Hallo " + vornameArray[i] + " " + nachnameArray[i] + ", wie geht es Dir?");
	      			
	      		}
	    			{
	    				System.out.println("=== CB ===");
	    				for (int i = 0 ; i < nameArray.length ;i++) {
	    					int comma = nameArray[i].indexOf(",");
	    					nachnameArray[i] = nameArray[i].substring(0,comma).trim();
	    					vornameArray[i] = nameArray[i].substring(comma + 1, nameArray[i].length()).trim();
	    				}
	} // E

}
