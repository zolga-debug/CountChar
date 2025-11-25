package verzweigung;

public class WennElse {

	public static void main(String[] args) {
		{
			if (5 == 3 + 2) {
				System.out.println("drin");
			}

			boolean bedingung /*:*/= true;
			if (bedingung == true) {
				System.out.println("Bed. ist erfüllt.");
			} else {
				System.out.println("Bed. ist nicht erfüllt.");
			}

			if (bedingung/* == true */) {
				System.out.println("Bed. ist erfüllt.");
			} else {
				System.out.println("Bed. ist nicht erfüllt.");
			}

			if (bedingung = false) { // if will Wahrheitswert
				System.out.println("Bed. ist erfüllt.");
			} else {
				System.out.println("false: Bed. ist nicht erfüllt.");
			}

			if (bedingung) {
				System.out.println("Bed. ist erfüllt.");
				System.out.println("Noch eine Anweisung");
			} else {
				System.out.println("Bed. ist nicht erfüllt.");
			}

//		bedingung=true;
			if (bedingung)
				System.out.println("Bed. ist erfüllt.");
			else
				System.out.println("Bed. ist nicht erfüllt.");
			    System.out.println("Noch eine Anweisung"); // analog "goto fail" im Artikel ("fliegende Finger")

//		 2 Fälle unterscheiden
			System.out.println("Test auf Volljährigkeit");
			int alter = 13;
			if (alter >= 18) {
				System.out.println("volljährig");
			} else {
				System.out.println("nicht volljährig");
			}

			System.out.println(
					"Übung: bitte unterscheiden Sie 3 Fälle: volljährig, strafmündig (ab 14), nicht strafmündig");

		}
		{
			System.out.println("==== DA ====");
			int alter = 1;
			 
			// Lösung 1: ohne Schachtelung
					if(alter >=18){
						System.out.println("Volljährig und Strafmündig");
					}
					if (alter > 14 & alter < 18) {  // doppelte Bedingung muss sein, da keine Schachtelung
						System.out.println("Strafmündig");
					}else {
						System.out.println("Minderjährig");
					}
			// Lösung 2: mit Schachtelung ohne Block beim ersten else
					if(alter >=18){
						System.out.println("Volljährig und Strafmündig");
					}
					else 
						if (alter > 14 /*& alter < 18*/) {  // doppelte Bedingung: nicht nötig wg. Schachtelung
						System.out.println("Strafmündig");
					}else {
						System.out.println("Minderjährig");
					}
		}
		{
			System.out.println("==== KK ====");
			int alter = 18; // Vorteil bei Verwendung der Variablen ist die leichte Anpassung
	    	int volljährig = 18;
	    	int strafmündig = 14;
//	        wie DA Lös. 2
	    	if (alter >= volljährig) {
	    	   System.out.println("Du bist " + alter + " also bist Volljährig und Strafmündig");
	    	}
	    	else // Schachtelung
if (alter < volljährig && alter >= strafmündig) { // doppelte Bedingung
	    	   System.out.println("Du bist " + alter + " also bist du Strafmündig");
	    	}
	    	else {
	    	   System.out.println("Du bist " + alter + " also bist Minderjährig und nicht Strafmündig");
		}}

	    	{
	    		System.out.println("==== ST ====");
	    		System.out.println("======== Prüfung des Alters in drei Fällen ========");
	    		int alter = 18;
				
				if(alter >= 18) {
					System.out.println("Die Person ist volljährig!");
				}else if(alter >= 14) {
					System.out.println("Die Person ist strafmündig!");
				}else {
					System.out.println("die Person ist weder strafmündig, noch volljährig!");
				}
	    	}
	    	
	    	{
	    		System.out.println("==== AK ====");
	    		{
	    			int alter = 13;
	     
	    			if (alter < 14) { // hier: erster Test: Das geringe Alter
	    				System.out.println("Glück gehabt du kleiner Bandit");
	    				System.out.println("Mit "+alter+" Jahren ist man noch nicht Strafmündig");
	    			} else if (alter < 18) {
	    				System.out.println("Tja, nicht ganz so gut gelaufen");
	    				System.out.println("Mit "+alter+" Jahren ist man schon Strafmündig");
	    			} else
	    				System.out.println("Arschkarte gezogen jetzt geht es ins Kittchen\n"
	    								   +"Mit "+alter+" Jahren ist man Volljährig");
	    		}
	     
	    		{
	    			System.out.println("==== CB ====");
	    			int age = 13;
					
					if (age >= 18 ) {
						System.out.println("Volljährig");
					} else if (age >= 14 /* && age < 18*/) { // doppelte Bedingung
						System.out.println("Strafmündig");
					} else {
						System.out.println("Nicht strafmündig");
					}
	    		}
	    		
	    		{
	    			System.out.println("==== GT ====");
	    			int alter=13;
	    			if (alter >=18) {
	    				System.out.println("volljährig");
	    			}else if (alter >=14) {
	    				System.out.println("strafmündig, aber nicht volljährig");
	    			}else {
	    				System.out.println("nicht strafmündig");
	    			}
	    		}
	    		
	    		{
	    			System.out.println("=== konsequent geblockt ===");
	    			System.out.println("Test auf Volljährigkeit");
	    			int alter = 13;
	    			if (alter < 14) {
	    				System.out.println("nicht strafmündig");
	    			} else {
		    			if (alter < 18) {
		    				System.out.println("nicht strafmündig");
		    			} else {
		    				System.out.println("volljährig");
		    			}
	    			}
	    		}
	    		
	    		
	    	}	    	
	} // EndOfMain
}