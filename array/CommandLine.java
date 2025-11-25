package array;

public class CommandLine {

	public static void main(String[] args) {
		System.out.println(args); // [Ljava.lang.String;@15db9742
		System.out.println(args.length); // 0
		System.out.println(args[1]);
		
//		Übergabe von Argumenten in der "CommandLine": Hallo Welt
		for (String element : args) {
			System.out.println(element);
		}
		
		
		System.out.println("==== CB ====");
		for (String element : args) {
			System.out.print(element + " ");
		}
	 
		System.out.println("\n==== AK ====");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
		}
		System.out.println();
 
 
 
	}

}
