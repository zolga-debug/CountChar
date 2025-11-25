package uebungen;

import java.util.Random;

public class PasswortGenAK {

	public static void main(String[] args) {

		
		String passWord = generatePW();
		System.out.println("Das Passwort lautet: " + passWord);
 
	}
 
	public static String generatePW() {
		String pw = "";
		for (int i = 0; i < 10; i++) {
			int ch = rand(127);
			pw += (char) ch;
			System.out.println("char "+ (i+1) + ": " + ch + "\t" + (char) ch);
		}
		return pw;
	}
	
	private static int rand(int i) {
		return new Random().nextInt(i+1);
 
	}
 
}
