package funky.nr_equality;

import java.util.function.BiPredicate;

public class NrEquality {

	public static void main(String[] args) {
//		Zwei ganze Zahlen (32 Bit) sollen verglichen werden.
		BiPredicate<Integer, Integer> aufGleichheitPruefen = (zahl1, zahl2) -> zahl1==zahl2; // BiPredicate => OCP
		int zahlA = 1;
		int zahlB = 1;
		int zahlC = 2;
		System.out.println(aufGleichheitPruefen.test(zahlA,zahlB));
		System.out.println(aufGleichheitPruefen.test(zahlA,zahlC));
	}

}
