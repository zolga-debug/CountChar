package p.g;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImKonstruktor extends JFrame  {

	public ImKonstruktor() {
		super("per Superklasse Titel hinzufügen");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Zentrierung
		JLabel label = new JLabel("BliBlaBlub");
		add(label);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImKonstruktor();
	}

}
