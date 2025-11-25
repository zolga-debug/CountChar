package funky.ist_gerade_predi;

import java.util.function.Predicate;

public class PosPredi {

	public static void main(String[] args) {
//		Übung: Bitte prüfen Sie, ob eine Zahl pos. ist.
//		Verwenden Sie das ein passendes Predicate.
//		
	
		
		Predicate<Integer> isPos = (num) -> num > 0;
		int number = -34;
		System.out.println("Ist " + number + " eine positivie Zahl: " + (isPos.test(number) ? "JA!" : "NEIN!"));
		
		System.out.println("====  ====");
		
        Predicate<Integer> istPos = x -> x > 0;
		
		int i = 5;
		int j = -6;
		
		System.out.println(isPos.test(i));
		System.out.println(isPos.test(j));
		
	}

}
