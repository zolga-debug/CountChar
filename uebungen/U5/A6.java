package uebungen.U5;

public class A6 {

	public static void main(String[] args) {
//		Annahme: XOR vor OR
		System.out.println(true ^ (false | true)); // false
		System.out.println(true ^ false | true); // true 
		System.out.println(true ^ false | false); // true 
		System.out.println(false ^ false | true); // true 
		System.out.println(false ^ true | false); // true 
		System.out.println(true ^ true | false); //false
		System.out.println("==================");
		boolean num1 = true;
		System.out.println(num1 = false && !(false | false) );
	}

}
