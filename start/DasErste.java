// kein Package-Name
package start;

public class DasErste {

	public static void main(String[] args) {
//		Der für uns im Moment interessante Bereich.
		System.out.println("Hallo"); // '
		System.out.println("Welt");
		
		System.out.print("Hallo");
		System.out.println(" Welt");
		
		System.out.println();
		
		System.out.print("Hallo");
		System.out.print("wie");
		System.out.print("gehts?");
		
		System.out.println();
		
		System.out.print("Hallo ");
		System.out.print("wie ");
		System.out.print("gehts?");
		
		System.out.println("\nHallo"); // Escape-Sequenz: CR+LF
		
		System.out.println("Das Wetter ist heute \"besonders\" schön.");
		System.out.println("Dies ist der Backslash: \\");
		
		System.out.println(7);
		System.out.println(1+2);
		System.out.println(5*6-5*2); // Punkt vor Strich
		
		System.out.println("Hallo"  +   " "   +    "Welt");
		System.out.println(1+3+"Hallo"+4+5); // Vermutung: 4Hallo9 => 4Hallo45
		System.out.println(1+3+"Hallo"+(4+5)); // 
		System.out.println(5*(6-5)*2); // Prio.-Änderung
		System.out.println(""+1+2+3); // tricky: 123
		}
}
