package exception;

public class Aufgabe {
	static int[] ia;
	public static void main(String[] args) {
		System.out.println("B");
		ia = new int[] {};
		System.out.println("F");
		try {
			System.out.println("A");
			ia[0]=1;
			System.out.println("C");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("E");
		}
		System.out.println("D");
	}
}
