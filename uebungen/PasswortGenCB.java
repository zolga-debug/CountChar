package uebungen;

import java.util.Random;

public class PasswortGenCB {

	public static void main(String[] args) {
		int passwordLength = 10;
		String password = "";
		
		for (int i = 0 ; i < passwordLength ; i++) {
			int intForChar = new Random().nextInt(94) + 33;
			char charForPassword = (char)intForChar;
			password += charForPassword;
		}
		
		System.out.println("Generiertes Passwort: " + password);
 
	}

}
