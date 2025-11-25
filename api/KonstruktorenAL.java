package api;

import java.util.ArrayList;

public class KonstruktorenAL {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList<>(); 
		// API: Constructs an empty list with an initial capacity of ten.
		// Code: private static final int DEFAULT_CAPACITY = 10;
		// Code: private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
		System.out.println(al1); // toString
//		Methods inherited from class java.util.AbstractCollection
//		containsAll, toString
		
//		public String toString()
//		Returns a string representation of this collection. 
//		... enclosed in square brackets ("[]").
		
		System.out.println(al1.isEmpty());
		System.out.println(al1.size());
		
		ArrayList al2 = new ArrayList<>(1_000); // analog SB
//		System.out.println(al2.trimToSize());
		System.out.println(al2.size()); 
		
		ArrayList al3 = new ArrayList(al2); // analog SB
		ArrayList<Object> alo;
		int t = (int) 2L;
		ArrayList<String> als;
		als = new ArrayList<String>();
		ArrayList<Integer> al5 = new ArrayList<Integer>();
		al5.add(8);
		ArrayList<Object> al6 = new ArrayList<Object>();
		ArrayList<String> al7 = new ArrayList<>(); // Diamond-Op.
		ArrayList<> al8 = new ArrayList<String>(); // Diamond-Op.
		ArrayList<Integer> al9 = new ArrayList<String>(); // Diamond-Op.
		ArrayList<int> al10 = new ArrayList<>(); // Diamond-Op.
		
	}

}
