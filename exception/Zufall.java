package exception;

import java.util.Random;

public class Zufall {
	  static String string;
	  public static void main(String[] args) {
		  
	  
//	    Übung: Bitte ergänzen Sie das PRG so, dass durch den Zufall gesteuert mal die eine, 
//	    mal die andere Exception geworfen wird, oder aber kein Laufzeitfehler stattfindet.
		  Random rnd = new Random();
		    try {
			int zufall = rnd.nextInt(3);// 1,2 oder 3  
	    	if (zufall==0) {     // NPE
	      System.out.println(string.charAt(0));
	      }else 
	    	  if (zufall==1) {   //StringIndexOutOfBounds
	      System.out.println("".charAt(0));
	      }else{
	      System.out.println("Es ist nichts passiert.");
	    }
		    }catch (StringIndexOutOfBoundsException e) {
	      System.out.println("StringIndexOutOfBoundsException gefangen");
	    } catch (NullPointerException e) {
	      System.out.println("NullPointerException gefangen");
	    }
	    System.out.println("Es geht weiter");
	  }
}
