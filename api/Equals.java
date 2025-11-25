package api;

import java.util.ArrayList;

public class Equals {

	public static void main(String[] args) {
		ArrayList<String> als1 = new ArrayList<String>();
		ArrayList<String> als2 = new ArrayList<String>();
		System.out.println(als1 == als2); 
		System.out.println(als1.equals(als2)); 
		Auto a1 =new Auto();
		Auto a2 =new Auto();
		System.out.println(a1.equals(a2));
		
		als1.add("Hallo");
		ArrayList<String> als3 = new ArrayList<String>(als1); // Kopie in neues Obj.
		System.out.println(als1.equals(als3)); 
//		public boolean equals(Object o)
//
//		Compares the specified object with this list for equality. Returns true if and only if the specified object is also a list, both lists have the same size, and all corresponding pairs of elements in the two lists are equal.
		System.out.println(als1 == als3); 
//		als1=als3;
//		System.out.println(als1 == als3); 
		als1.add(0,"!");
		System.out.println(als1);
		als3.add("!");
		System.out.println(als3);
		System.out.println(als1.equals(als3)); 
		
//		analog zu
		System.out.println("Hallo".equals("Hallo"));
	}

}
