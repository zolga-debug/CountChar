package oop.pm;

//@formatter:off
class Eltern{}
class Kind extends Eltern{}
class Enkel extends Kind{}
//@formatter:on

public class Instanceof {
	public static void main(String[] args) {
		Enkel e1 = new Enkel();
		Kind k1 = new Kind();
		Eltern e2 = new Eltern();
		System.out.println(e1 instanceof Eltern);
		System.out.println(k1 instanceof Eltern);
		System.out.println(e2 instanceof Eltern);
		
		System.out.println(k1 instanceof Enkel);
		
	}
}
