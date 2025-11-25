package p.g;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFeldInklNameOhneAktion {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 650);
		frame.setLocation(-1100, 1200); //
		frame.setLayout(null);
		frame.setTitle("Knopf ohne Aktion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    JLabel nameLab = new JLabel();
	    nameLab.setFont(new Font("Verdana",Font.PLAIN,16));
//	    nameLab.setBounds(20, 100, /*230*/ 70, 30); // x,y,B,H
	    nameLab.setBounds(20, 100, 230, 30); // x,y,B,H
	    nameLab.setText("Bitte Name eintragen");
		frame.add(nameLab);
		
	    JTextField nameTextF = new JTextField();
	    nameTextF.setFont(new Font("Verdana",Font.PLAIN,16));
	    nameTextF.setBounds(270, 100, 140, 30); // x,y,B,H
	    frame.add(nameTextF);
	    
		frame.setVisible(true);
	}

}
