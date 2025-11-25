package uebungen;

import java.util.Random;

import javax.swing.JOptionPane;

public class PasswortGenDA {

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Hallo");
		
		
		Random rnd = new Random();
//		StringBuilder pass = new StringBuilder();
		int pwd = 0;
		for(int i =0; i<10; i++) {
			pwd = rnd.nextInt(94) + 33; // ohne Space und ohne ersten 32 Steuerzeichen
//			pass.append((char)pwd);
			System.out.print((char)pwd);
			
		} //JOptionPane.showMessageDialog(null, pass.toString());
 
	}

}


