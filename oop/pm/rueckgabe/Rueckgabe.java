package oop.pm.rueckgabe;

import java.util.Random;

public class Rueckgabe {

	public static void main(String[] args) {
		for(int i=0;i<10;++i)
		System.out.print/*ln*/(pmRueckgabe().getClass().getSimpleName()+" ");
	}

	static Eltern pmRueckgabe() { // PM-Rückgabe
		if (new Random().nextBoolean()) {
			return new Eltern();
		}else {
			return new Kind();
		}
	}
}

class Eltern {
}

class Kind extends Eltern {
}