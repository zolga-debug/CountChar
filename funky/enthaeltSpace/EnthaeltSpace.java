package funky.enthaeltSpace;

import java.util.function.Predicate;

public class EnthaeltSpace {

	public static void main(String[] args) {
//		Übung: Bitte prüfen Sie, ob ein String ein Lerzeichen enthält.
//		Verwenden Sie dazu ein passendes Predicate.
		
		Predicate<String> predi = (text) -> {
			return text.contains(" ");
		};
			
		System.out.println(predi.test("Hallo Welt"));
		
		
		
	}

}
