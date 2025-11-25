package array;

public class LeereZweite {

	public static void main(String[] args) {
		int []/*[]*/ multiIntArr;
		multiIntArr = new int [3][/*2*/];
		int [] zeile0 = {2,7};
		int [] zeile1 = {3,12};
		int [] zeile2 = {4,8};
		
		for (int[] i : multiIntArr) {
			System.out.println(i);
		}
		
		multiIntArr[0] = zeile0;
		multiIntArr[1] = zeile1;
		multiIntArr[2] = zeile2;
		
		for (int[] i : multiIntArr) {
			System.out.println(i);
		}
		
		for (int[] i : multiIntArr) {
			for (int j : i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
