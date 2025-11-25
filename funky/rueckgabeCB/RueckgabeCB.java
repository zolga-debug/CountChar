package funky.rueckgabeCB;

import java.util.Random;

public class RueckgabeCB {
	public static void main(String[] args) {
		FunkInt mrZufall = () -> new Random().nextInt(6) + 1;
		System.out.println("Gewürfelte Augenzahl: " + mrZufall.mini());
	}
}

interface FunkInt {
	int mini();
}