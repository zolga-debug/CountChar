package p.g;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KnopfMitActionInMainLambda {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 650);
		frame.setLocation(-1100, 1200); //
		frame.setLayout(null);
		frame.setTitle("Knopf ohne Aktion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton absendeBtn = new JButton();
		absendeBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		absendeBtn.setBounds(280, 250, 130, 30);
		absendeBtn.setText("Absenden");

//		Übung: Bitte ersetzen Sie die anonyme Klasse durch einen Lambda-Ausdruck
//		Aktion beschreiben
		ActionListener al = new ActionListener() { // Beginn Body der a. Kl.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Knopf wurde gedrückt");
			}
		}  // schließende Klammer der anonymen Klasse
		; // Ende des Assignments
		
//		AK
		 al = e -> System.out.println("AUA!");
		absendeBtn.addActionListener(al); // Abhörer dem Knopf zuweisen
		
		frame.add(absendeBtn);
		frame.setVisible(true);
	}

}
