package exception;

import java.util.Random;

public class ZufallAK {
	static String string;
	  public static void main(String[] args) {
		  
		Random rand = new Random();
		int zufall = rand.nextInt(3); // f. 3 Fälle
		
		System.out.println(zufall);
		
	    try {
	    	switch (zufall) {
			case 0:
				System.out.println(string.charAt(0));
				break;
			case 1:
				System.out.println("".charAt(0));
				break;
			case 2:
				System.out.println("Es ist nichts passiert.");
				break;
			}
	    } catch (StringIndexOutOfBoundsException e) {
	      System.out.println("StringIndexOutOfBoundsException gefangen");
	    } catch (NullPointerException e) {
	      System.out.println("NullPointerException gefangen");
	    }
	    System.out.println("Es geht weiter");
	  }
}


