package api;

import java.util.ArrayList;

public class Enhanced { // set

	public static void main(String[] args) {
		System.out.println(
				"=== Übung: Bitte an alle Vogel-Namen ein Ausrufezeichen anhängen und i.d. Console ausgeben. ===");
		ArrayList<String> birds = new ArrayList</* String */>();
		birds.add("hawk");
		birds.add("robin");
		birds.add("hawk");
		birds.add("hawk");
		birds.add("cardinal");
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds);
		ArrayList<String> save = new ArrayList</* String */>(birds);

//			hier kommt Ihr Code hin

		{
			System.out.println("==== AK ====");
			birds = new ArrayList</* String */>(save);
			int i = 0;

			for (String vogel : birds) {
				birds.set(i, vogel + "!"); // Trick: Index erzeugen und verändern, um Elemente der AL direkt zu verändern
//				public E set(int index,
//			             E element)
//
//			Replaces the element at the specified position in this list with the specified element.
//				Returns:
//				    the element previously at the specified position
				i++;
			}

			System.out.println(birds); // [hawk!, robin!, hawk!, hawk!, cardinal!, hawk!, hawk!]
		}
//		{
//			System.out.println("==== XXX ====");
//			birds = new ArrayList</* String */>(save);
//			int i=0;
//			for (String vogel : birds) {
//				System.out.println("\""+birds.set(i, vogel + "!")+ "\" wird durch \"" +vogel +"\" ersetzt.");
//				i++;
//			}
//		}
		{

			System.out.println("==== ST ====");
			birds = new ArrayList</* String */>(save);
			for (String vogel : birds) {
				if (vogel.equals("hawk")) {
					System.out.println(vogel + "!");
				} else {
					System.out.println(vogel);
				}
			}
			System.out.println(birds); // [hawk, robin, hawk, hawk, cardinal, hawk, hawk]
		}
		{
			
			System.out.println("==== CB ====");
			birds = new ArrayList</* String */>(save);
			for (String element : birds) {
				System.out.println(element = element.concat("!"));
			}
	 System.out.println(birds); // [hawk, robin, hawk, hawk, cardinal, hawk, hawk]
		}
		{
			
			birds = new ArrayList</* String */>(save);
			System.out.println("==== KK ====");	       
			for (int i = 0; i < birds.size(); i++) { // Index für set() steht durch for(;;) schon zur Verfügung 
	            String bird = birds.get(i);
	            bird = bird + "!";
	            birds.set(i, bird);
	        }
 
	        System.out.println(birds); // [hawk!, robin!, hawk!, hawk!, cardinal!, hawk!, hawk!]
	    }
		{
			
			birds = new ArrayList</* String */>(save);
			System.out.println("==== xxx ====");
			System.out.println(birds);
			birds.replaceAll(s -> s+"!");
			System.out.println(birds); // [hawk!, robin!, hawk!, hawk!, cardinal!, hawk!, hawk!]
		}
 
	} // E

}
