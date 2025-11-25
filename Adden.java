package api;

import java.util.ArrayList;
class Schiff{}
public class Adden {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hallo");
		list.add(true);
		list.add(1);
		list.add(new Schiff());
		System.out.println(list); // [Hallo, true, 1, api.Schiff@15db9742]
		
//		Übung: Bitte geben Sie in einer Schleife alle Elemente in der Console aus.
		
	}

}
