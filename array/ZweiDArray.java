package array;

public class ZweiDArray {

	public static void main(String[] args) {
		int[][] multiIntArr;
		multiIntArr = new int[3][2]; // "Tabelle", "Fläche": 3 Zeilen und 2 Spalten
		multiIntArr[0][0] = 2;
		multiIntArr[0][1] = 7;
		multiIntArr[1][0] = 3;
		multiIntArr[1][1] = 12;
		multiIntArr[2][0] = 4;
		multiIntArr[2][1] = 8;

//		Übung: Bitte zeigen Sie die Inhalte (ohne(!) Schleife) an
		System.out.println("==== KK ====");
		System.out.println(multiIntArr[0][0]);
		System.out.println(multiIntArr[0][1]);
		System.out.println(multiIntArr[1][0]);
		System.out.println(multiIntArr[1][1]);
		System.out.println(multiIntArr[2][0]);
		System.out.println(multiIntArr[2][1]);

		System.out.println("==== ST, CB, AK ====");
		System.out.println(multiIntArr[0][0] + " | " + multiIntArr[0][1]);
		System.out.println(multiIntArr[1][0] + " | " + multiIntArr[1][1]);
		System.out.println(multiIntArr[2][0] + " | " + multiIntArr[2][1]);

//		Übung: Bitte zeigen Sie die Inhalte (mit(!) Schleife) an
//		1.) mit der standard-for-loop
		System.out.println("=== ST, KK ===");
		for (int i = 0; i < multiIntArr.length; i++) {
			for (int x = 0; x < multiIntArr[i].length; x++) {
				System.out.print(multiIntArr[i][x] + " | ");
			}
		}

		System.out.println("=== ST ===");
		for (int i = 0; i < multiIntArr.length; i++) {
			for (int j = 0; j < multiIntArr[i].length; j++) {
				System.out.print(multiIntArr[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println("=== CB ===");
		for (int i = 0; i < multiIntArr.length; i++) {
			for (int j = 0; j < multiIntArr[0].length; j++) {
				System.out.println("mulitIntArr[" + i + "][" + j + "]: " + multiIntArr[i][j]);
			}
		}
		System.out.println("=== 2.) mit der enhanced-for-loop ===");
		System.out.println("=== KK ===");
		for (int[] zeile : multiIntArr) {
			for (int wert : zeile) {
				System.out.println(wert);
			}
		}
		
		System.out.println("=== CB ===");
		int row = 0;
		for (int[] arrayRow : multiIntArr) {
			int column = 0;
			for (int element : arrayRow) {
				System.out.println("multiIntArr[" + row + "][" + column + "]: " + element);
				column++;
			}
			row++;
		}
		System.out.println("=== AK ===");
		for (int[] i : multiIntArr) {
			for (int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
 
 
	} // E

}
