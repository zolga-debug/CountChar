package exception;

public class Test {

	public static void main(String[] args) {
		try {
			int i=5/0;
		} catch (/*Arithmetic*/Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
