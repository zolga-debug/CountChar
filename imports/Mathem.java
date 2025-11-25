package imports;

//import java.lang.Math; // import die Klasse Math, aber nicht deren Methoden
//import static java.lang.Math.*; // import alle statischen Methoden der Klasse Math
import static java.lang.Math.*; // CF ohne Stern *

public class Mathem {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(2)); // 1.4142135623730951
		System.out.println(Math.round(Math.sqrt(2))); // 1
		
		System.out.println(sqrt(3)); // CF ohne statischen import: The method sqrt(int) is undefined for the type Mathem
	}

}
