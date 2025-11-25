package Dos;

import javax.swing.JOptionPane;

public class DosBoxArgumente {

	public static void main(String[] args) {
		String text="";
		for (String element : args) {
			text+=element+" ";
		}
//		System.out.println(text);
		JOptionPane.showMessageDialog(null, text);
	}

}
