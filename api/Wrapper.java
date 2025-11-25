package api;

public class Wrapper {

	public static void main(String[] args) {
		Boolean bool1 = new Boolean("TRUE");
		System.out.println(bool1); // t
//		Boolean bool2 = new Boolean(TRUE);
		Boolean bool3 = new Boolean(true);
		Boolean bool4 = new Boolean(Boolean.FALSE);
		Boolean bool5 = new Boolean("Hallo");
		Boolean bool6 = new Boolean("tRuE");
		Boolean bool7 = new Boolean(bool4);
		
		System.out.println(bool5);
		System.out.println(bool6);
//		public Boolean(String s)
//
//		Allocates a Boolean object representing the value true if the string argument is not null and is equal, ignoring case, to the string "true". Otherwise, allocate a Boolean object representing the value false
		
	}

}
