package funky.ListeAuswerten;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListeAuswerten {

	public static void main(String[] args) {
		
		
		List <Integer> numList = Arrays.asList(8, 9, 7, 2, 0, 3, 10, 7, -1);
		Predicate<Integer> predi = zahl-> zahl>5 ;
						
		for (Integer element : numList) {
			if (predi.test(element))
			System.out.print(element+" ");
		}
		
	//	System.out.println("Alle Zahlen ausgeben, die größer als 5 sind");
		
	}

}
//8 9 7 10 7 