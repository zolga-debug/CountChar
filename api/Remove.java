package api;

import java.util.ArrayList;
class Bird{}
public class Remove {

	public static void main(String[] args) {
		{
			ArrayList<String> birds = new ArrayList</* String */>();
			birds.add("hawk");
			birds.add("robin");
			System.out.println(birds);
			birds.add(0, "blue jay");
			System.out.println(birds);
			birds.add(1, "cardinal");
			System.out.println(birds);
			birds.add(new String("Hola"));
//		birds.add(new StringBuilder("Hallo")); // CF
			birds.add(new StringBuilder("Hallo").toString()); //

			ArrayList<String> strings = new ArrayList</* String */>();
			strings.add("Hallo");
			strings.add(new String(" Welt"));
			strings.add(new ArrayList</* String */>().toString());
			System.out.println(strings); // [Hallo, Welt, []]

		}
		{
			ArrayList<String> birds = new ArrayList</* String */>();
			birds.add("hawk");
			birds.add("robin");
			birds.add("hawk");
			birds.add("cardinal");
			System.out.println(birds);

			birds.remove("cardinal");
			System.out.println(birds);
			birds.remove("hawk"); // Removes the first occurrence of the specified element from this list, if it is present.
			System.out.println(birds);
			birds.remove(0);
			System.out.println(birds);
			System.out.println(birds.remove(0));
			System.out.println(birds);
			birds.add("robin");
			System.out.println(birds);
			System.out.println(birds.remove("hawk"));
			System.out.println(birds);
			System.out.println(birds.remove("robin"));
			System.out.println(birds);
		}
		{
			System.out.println("=== Übung: Bitte alle Falken i.d. Liste löschen ===");
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

//			hier kommt Ihr Java-Code hin

			System.out.println("=== KK ===");
			birds.removeIf(hawkTuah -> hawkTuah.equals("hawk"));
			System.out.println(birds);

			System.out.println("=== CB ===");
			birds = new ArrayList</* String */>(save);
			for (int i = 0; i < birds.size(); i++) { // unbedingtes Inkrement in sich verkürzender Liste
				if (birds.get(i).equals("hawk")) {
					birds.remove(i);
				}
			}
			System.out.println(birds);

			System.out.println("=== xx ===");
			birds = new ArrayList</* String */>(save);
			System.out.println(birds);
			for (int i = 0; i < birds.size(); i++) { // if nicht nötig. Achtung: keine Index-Korrektur
				birds.remove("hawk"); // keine Nutzung des Rückgabewertes
			}
			System.out.println(birds); // Fehler: in sich verkürzender Liste werden nicht alle hawks gelöscht!

			birds = new ArrayList</* String */>(save);
			for (; birds.remove("hawk");)
				;
			System.out.println(birds);
			
			birds = new ArrayList</* String */>(save);
			for (int i = 0; i < birds.size(); i++) { // if nicht nötig. Achtung: keine Index-Korrektur
				System.out.println(birds.size()+": "+birds.remove("hawk"));
			}
			System.out.println(birds); // Fehler: in sich verkürzender Liste werden nicht alle hawks gelöscht!
			
			

			System.out.println("=== DA ===");
			birds = new ArrayList</* String */>(save);
			for (int i = 0; i < birds.size(); i++) {
				birds.remove("hawk");
			}
			System.out.println(birds);

			System.out.println("=== ST ===");
			birds = new ArrayList</* String */>(save);
			for (int i = 0; i < birds.size(); i++) {
				if (birds.get(i).equals("hawk")) {
					birds.remove("hawk");
					i--; // nur dann inkrementieren, wenn nicht gelöscht wurde.
				}
			}
			System.out.println(birds);

			System.out.println("=== AK ===");
			birds = new ArrayList</* String */>(save);
			while (birds.remove("hawk")) {
			} // tricky
			System.out.println(birds);

			System.out.println("=== TS ===");
			birds = new ArrayList</* String */>(save);

			while (birds.contains("hawk")) {
				birds.remove("hawk");
			}
			System.out.println(birds);

//			Lös.: "Pferd von hinten aufzäumen" Übung: Bitte löschen Sie die Elemente "hawk" von hinten nach vorne.
			System.out.println("=== ST ===");
			birds = new ArrayList</* String */>(save);
			for (int i = birds.size(); i > 0; i--) { // birds.size() => "Glück gehabt"
				birds.remove("hawk"); // Beginn bei n+1 ist kein Problem, da Index nicht verwendet wird
			}
			System.out.println(birds);

			System.out.println("=== AK ===");
			birds = new ArrayList</* String */>(save);
			for (int i = birds.size()-1; i >= 0; i--) { // -1 nötig wg. line 1
				if (birds.get(i).equals("hawk")) { // line 1
					birds.remove(i); 
				}
			}
			System.out.println(birds);
	 
			System.out.println("=== KK ===");
			birds = new ArrayList</* String */>(save);
			for (int i = birds.size() - 1; i >= 0; i--) {
			    if (birds.get(i).equals("hawk")) {
			        birds.remove(i);
			        System.out.println(birds);
			    }
			}
 
			System.out.println("=== xxx ===");
			birds = new ArrayList</* String */>(save);
			System.out.println(birds); // [hawk, robin, hawk, hawk, cardinal, hawk, hawk]
			
			ArrayList<String> steuernde = new ArrayList<String>();
			steuernde.add("hawk");
			birds.removeAll(steuernde);
			System.out.println(birds); // [robin, cardinal]
		} // EndOfÜbungsBlock

	} // E
}