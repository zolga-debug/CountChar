package exception;

public class Surround {

	public static void main(String[] args) {
		try {
			System.out.println(5/0); // Risiko
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Übung:
//		Bitte sichern Sie die Berechnung so ab, dass keine " / 0" - Exception geworfen werden kann.
		double a = 1;
		double b = 34;
		
		if(a == 0 | b==0) {
			System.out.println("Man darf nicht durch null teilen");
		}else {
			System.out.println(a/b); // 0 / irgendwas = 0
		}
		
 
	}

}
