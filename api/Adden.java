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
		System.out.println("=== KK ===");
		for (int i = 0; i < list.size(); i++) {
		    Object element = list.get(i);
		    System.out.println(element);
		}
		System.out.println("=== AK, ST ===");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=== CB ===");
		for (Object elements : list) System.out.println(elements);
		 
		int[] ia = {1,9};
		System.out.println(ia); // [I@6d06d69c
		list.add(ia);
		System.out.println(list); // [Hallo, true, 1, api.Schiff@15db9742, [I@6d06d69c]

		System.out.println(list.get(4));
		
		for (int element :  (int[]) list.get(4)) {
			System.out.println(element);
		}
		int [] temp = (int[]) list.get(4);
		for (int element :  temp) {
			System.out.println(element);
		}
	}
}
