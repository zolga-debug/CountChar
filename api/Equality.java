package api;

import java.util.Random;

public class Equality {

	public static void main(String[] args) {
		System.out.println("abc".equals("ABC"));
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		System.out.println("abc".toLowerCase().equals("ABC".toLowerCase()));
		
		String a = "Hallo"; // Speicherung im String-Pool und nicht auf dem Heap
		String b = new String("Hallo");
		
		System.out.println(a.equals(b));
		
		System.out.println("==");
		String c = "Hallo"; // kein neues Obj.
		System.out.println(a==c);
		System.out.println("Welt" == "Welt");
		System.out.println(new String("bye")==new String("bye"));
		
		System.out.println(a==b);
		
		System.out.println(new Auto() == new Auto());
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
		
		Random r1 = new Random();
		Random r2 = new Random();
		System.out.println(r1==r2);
		
		int[] ia1 = new int[1];
		int[] ia2 = new int[1];
		System.out.println(ia1==ia2);
	}
	

}
class Auto{}