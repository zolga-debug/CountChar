package api.array.AutoTest;

public class Test {

}
class Auto{}
 class VarArgs {

	public static void main(String[] args) {
		/*Auto a=*/new Auto();
		varArgs(5);
		System.out.println();
		varArgs(5,6);
		System.out.println();
		varArgs(5,6,7,3,1_000);
		System.out.println();
//		varArgs(); // CF: Weiß nicht, welche Methode ausgeführt werden soll
		System.out.println();
		varArgs(new int[] {});
		varArgs(new Auto(),new Auto());
		System.out.println("ENTE");
	}
	static void varArgs(int... i) {
		for (int j : i) {
			System.out.println(j);
		}
		System.out.println("EndOfMethod");
	}
	static void varArgs(Auto... i) {
		for (Auto j : i) {
			System.out.println(j);
		}
		System.out.println("EndOfCarMethod");
	}
}
