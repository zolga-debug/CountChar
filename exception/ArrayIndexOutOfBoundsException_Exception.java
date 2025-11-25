package exception;

public class ArrayIndexOutOfBoundsException_Exception {

	public static void main(String[] args) {
		int [] intArr = {1};
		System.out.println(intArr[1]-1); // ArrayIndexOutOfBoundsException: 1
	}

}
