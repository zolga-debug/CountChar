package verzweigung;

public class AnredeVorNachName {

	public static void main(String[] args) {
		{
			// String vorname ="Susi";
			String vorname = "Otto";
			// String nachname ="Sorglos";
			String nachname = "Walkes";
			char geschlecht = ' ';

			//@formatter:off
			/*
			 * Übung: Bitte sorgen Sie für eine passende Anrede. 
			 * Für w: Hallo Frau Sorglos 
			 * Für m: Hallo Herr Walkes 
			 * Für d: Hallo Otto Walkes
			 * 
			 * Bitte realisieren Sie die Lösung einmal mit geschachteltem if ... else und einmal mit einem ternären Operator.
			 */
			//@formatter:on
		}
		{
			System.out.println("=============== ST ===============");
			System.out.println("=============== if - else ===============");
			String vorname1 = "Otto", vorname2 = "Susi";
			String nachname1 = "Walkes", nachname2 = "Sorglos";

//					char geschlecht = 'w';
			char geschlecht = 'm';

			if (geschlecht == 'm') {
				System.out.println("Hallo Herr: " + nachname1);
			} else {
				if (geschlecht == 'w') {
					System.out.println("Hallo Frau: " + nachname2);
				} else {
					System.out.println("Hallo" + vorname1 + nachname1);
				}
			}
		}
		{
			System.out.println("=============== Ternär ===============");
			String vorname1 = "Otto", vorname2 = "Susi";
			String nachname1 = "Walkes", nachname2 = "Sorglos";

			char geschlecht = 'd';

			String ternärAnrede = (geschlecht == 'm') ? "Hallo Herr " + nachname1
					: (geschlecht == 'w') ? "Hallo " + nachname2 : "Hallo " + vorname1 + " " + nachname1;

			System.out.println(ternärAnrede);

		}
		{
			System.out.println("=============== TS ===============");
			String vorname ="Otto";
			   String nachname ="Walkes";
			   char geschlecht = ' ';
			   
			   if (geschlecht == 'm') {
				   System.out.println("Hallo Herr " + nachname);
			   	} else if (geschlecht == 'w') {
			   			System.out.println("Hallo Frau " + nachname);
			   			} else {
			   				System.out.println("Hallo " + vorname + " " + nachname);
			   					}
			   //@formatter:off
			   System.out.println("Hallo " + (
					   geschlecht == 'm' ? "Herr " + nachname : 
						   geschlecht == 'w' ? "Frau " + nachname : vorname + " " + nachname));
			   //@formatter:on
	 
		}
		{
			System.out.println("=============== KK ===============");
			char geschlecht = 'd';
	    	if (geschlecht == 'w') {
	    		System.out.println("Guten Morgen Frau Walkes!");
	    	}
	    	else if (geschlecht == 'm') {
	    		System.out.println("Guten Morgen Herr Walkes");
	    	}
	    	else {
	    		System.out.println("Guten Morgen Otto Walkes");
	    	}
	        
	    	//@formatter:off
	        String begruessung =
	        	(geschlecht == 'w') ? "Guten Morgen Frau Walkes!" :
	            (geschlecht == 'm') ? "Guten Morgen Herr Walkes" :
	                                  "Guten Morgen Otto Walkes";
	        //@formatter:on
	        System.out.println(begruessung);
	    }	
		}
	{
		System.out.println("=============== CB ===============");
		{
			String firstName = "Otto";
			String lastName = "Walkes";
			char gender = 'w';
			
			if (gender == 'm') {
				System.out.println("Hallo Herr " + lastName);
			
			} else if (gender == 'w') {
				System.out.println("Hallo Frau " + lastName);
			
			} else if (gender == 'd') {
				System.out.println("Hallo " + firstName + " " + lastName);
			} // hier ist noch ein else mögl., sofern gewünscht
			
			
			
			String ternaryOutput = 
					(gender == 'm') ? "Hallo Herr " + lastName :
				(gender == 'w') ? "Hallo Frau " + lastName :
					(gender == 'd') ? "Hallo " + firstName + " " + lastName : "Sie müssen die Daten schon noch richtig angeben!";
			
			System.out.println(ternaryOutput);
		}
 	
	{
		System.out.println("=============== AK ===============");
		String vornamew = "Susi";
		String vornamem = "Otto";
		String nachnamew = "Sorglos";
		String nachnamem = "Walkes";
		char geschlecht = 'w';

		if (geschlecht == 'w') {
			System.out.println("Hallo Frau "+vornamew+" "+nachnamew+".");
		} else {
			if (geschlecht == 'm') {
				System.out.println("Hallo Herr"+vornamem+" "+nachnamem+".");
			} else {
				if (geschlecht == 'd') {
					System.out.println("Hallo "+vornamem+" "+nachnamem+".");
				}else{
					System.out.println("Na da ist irgenswas schief gelaufen");
				}
			}
		}
		
		System.out.println("Hallo " + (geschlecht == 'w'  ? "Frau " +vornamew+" "+nachnamew+"." :
								      (geschlecht == 'm') ? "Herr " +vornamem+" "+nachnamem+"." :
										                             vornamem+" "+nachnamem+"."));



	}
	} // ENdOfMain

}
