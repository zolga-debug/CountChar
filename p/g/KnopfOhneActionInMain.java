package p.g;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KnopfOhneActionInMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 650);
		frame.setLocation(-1100, 1200); //
		frame.setLayout(null);
		frame.setTitle("Knopf ohne Aktion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton absendeBtn = new JButton();
		absendeBtn.setFont(new Font("Verdana",Font.BOLD,16));
		absendeBtn.setBounds(280, 250, 130, 30);
		absendeBtn.setText("Absenden");
		
		frame.add(absendeBtn);
		frame.setVisible(true);
	}

}
