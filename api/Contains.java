package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> birds = new ArrayList</* String */>();
		birds.add("hawk");
		birds.add("robin");
		birds.add("hawk");
		birds.add("hawk");
		birds.add("cardinal");
		birds.add("hawk");
		birds.add("hawk");
		birds.add("hawks");
		System.out.println(birds);
//		for (String element : birds) {
//			
//		}
		System.out.println(birds.contains("hawk"));
		birds.clear();
		System.out.println(birds);
		ArrayList<String> save = new ArrayList</* String */>(birds);
		
		List <String> list = Arrays.asList("Hallo","Welt");
		System.out.println(list); // [Hallo, Welt]
//		list.remove(0); // UnsupportedOperationException
		
		String[] array = {"Hallo","Welt"};
		List <String> eineAndereListe = Arrays.asList(array);
		eineAndereListe.add("!"); // Returns a fixed-size list backed by the specified array
		
		
		
	}

}
