package exception;

public class MainRuftMain {

	public static void main(String[] args) {
		try {
			System.out.print("M");
			GerufeneMain.main(null);
			System.out.print("T");
		} catch (ArithmeticException e) {
			System.out.print("A");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.print("Z");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		System.out.print("B");
	}

}
//mab