package oop.kind_wie_eltern;

public class KindWieEltern {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1.name);
		
		Cabrio c1 = new Cabrio();
		System.out.println(c1.name);
		
	}

}
class Auto{
	String name="Ich habe noch keinen Namen";
	int geschwindigkeit;
}

class Cabrio extends Auto{} // Kind kann alles, was Eltern kann