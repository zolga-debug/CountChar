package funky.ListeAuswerten;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListeAuswertungen {
	

	public static void main(String[] args) {
		
	
		List <Integer> numList = Arrays.asList(8, 9, 7, 2, 0, 3, 10, 7, -1);
		for (Integer element : numList) {
			System.out.print(element+" ");
		}
		
//		Übung:
		System.out.println("\n======== Alle Zahlen ausgeben, die größer als 5 sind ========");
//		 mit Predicate
		
			Predicate<Integer> groesser5 = (zahl) -> zahl > 5;
			reuse(groesser5);
			
//			for (Integer zahl : numList) {
//				System.out.print(groesser5.test(zahl) ? zahl+" " : ""); // tricky
			

			System.out.println("\n=== CB ===");
			for (Integer element : numList) {
				
				Predicate<Integer> number = (num) -> num > 5;  
				if (number.test(element)) { System.out.print(element+" "); }
			}
	 
			System.out.println("\n======== Alle Zahlen ausgeben, die gerade sind ======== ");
			for (Integer element : numList) {
			Predicate<Integer> number = (num) -> num %2 == 0;  
			if (number.test(element)) { System.out.print(element+" "); 
			}
			}
		System.out.println("\n======== Alle Zahlen ausgeben, die ungerade sind ======== ");
		for (Integer element : numList) {
			Predicate<Integer> number = (num) -> num %2 == 1;  
			if (number.test(element)) { System.out.print(element+" "); }
	}
		System.out.println("\n======== Alle Zahlen ausgeben, die positiv sind ======== ");
		for (Integer element : numList) {
			Predicate<Integer> number = (num) -> num > 0;  
			if (number.test(element)) {
				System.out.print(element+" "); 
				}
			}
		System.out.println("\n========  positiv sind ======== ");
		reuse((zahl)-> zahl>0, numList);
		
		
		}//eom
			
	static List <Integer> numList = Arrays.asList(8, 9, 7, 2, 0, 3, 10, 7, -1);


	 static void reuse(Predicate <Integer> i) {
		for (Integer element : numList) {
			if (i.test(element)) {
				System.out.print(element+" ");
			}	

	}
  }	
	 static void reuse(Predicate<Integer> i, List <Integer>numList) {
			
			for (Integer zahl : numList) {
				System.out.print(i.test(zahl) ? zahl + " " : "");
			}
			System.out.println();
		}
	 
}
	