package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDim {

	public static void main(String[] args) {
		int[][] multiIntArr;
		multiIntArr = new int[3][/* 2 */];
		Integer [] zeile0 = { 2, 7 };
		int[] zeile1 = { 3, 12 };
		int[] zeile2 = { 4, 8 };
		
		
		List /*<Integer>*/ k = Arrays.asList(zeile0); // Integer auch OK
		ArrayList<Integer> tempo = new ArrayList<Integer>(k);
		ArrayList<Integer> tempi = new ArrayList<Integer>(zeile0); // CF
		ArrayList<Integer> tempi = new ArrayList<Integer>(Arrays.asList(zeile0));
		

//		Übung: Bitte realisieren Sie obige Lösung nun mit 2 ArrayList-Objekten.
		{
			System.out.println("=== AK ===");
			ArrayList<ArrayList<Integer>> intList = new ArrayList<>();

//			ArrayList<Integer> row1 = new ArrayList<>(List.of(2, 7)); > Java 8
			ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(2, 7));
			ArrayList<Integer> row2 = new ArrayList<>( Arrays.asList (  ((Integer[])zeile1) )); //  CF
			ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(4, 8));
			intList.add(row1);
//			intList.add(row2);
			intList.add(row3);
		}
		{
			System.out.println("=== CB ===");
			ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

			ArrayList<Integer> row1 = new ArrayList<>();
			row1.add(2);
			row1.add(7);
			multiList.add(row1);

			ArrayList<Integer> row2 = new ArrayList<>();
			row2.add(3);
			row2.add(12);
			multiList.add(row2);

			ArrayList<Integer> row3 = new ArrayList<>();
			row3.add(4);
			row3.add(8);
			multiList.add(row3);

			for (ArrayList<Integer> row : multiList) {
				for (Integer element : row) {
					System.out.print(element + " | ");
				}
				System.out.println();
			}

		}
		{
			System.out.println("=== St ===");
			ArrayList<ArrayList<Integer>> multiDimList = new ArrayList<>();

			ArrayList<Integer> zeile_0 = new ArrayList<>();
			zeile_0.add(2);
			zeile_0.add(7);

			multiDimList.add(zeile_0);

			ArrayList<Integer> zeile_1 = new ArrayList<>();
			zeile_1.add(3);
			zeile_1.add(12);

			multiDimList.add(zeile_1);

			ArrayList<Integer> zeile_2 = new ArrayList<>();
			zeile_2.add(4);
			zeile_2.add(8);

			multiDimList.add(zeile_2);

			System.out.println(multiDimList); // [[2, 7], [3, 12], [4, 8]]

		}
	} // E
}