package oop.eigenschaften;

public class Eigenschaften {

	public static void main(String[] args) {
		new Auto();
		new String("Hallo");
		String s = new String("Welt");
		System.out.println(s);
		Auto a1 = new Auto();
		System.out.println(a1); // oop.eigenschaften.Auto@15db9742
		int laenge = s.length();
		System.out.println(laenge);
		int maximal = Integer.MAX_VALUE;
		Automobil a2 = new Automobil();
		a2.geschwindigkeit=100;
		System.out.println(a2.geschwindigkeit);
	}

}
class Automobil {
	int geschwindigkeit = 0;
}