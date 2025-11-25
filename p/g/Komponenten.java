package p.g;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Komponenten extends JFrame {
	private JTextField nameTextFeld = new JTextField();
	
	public Komponenten() {
		super("Komponenten dem Fenster hinzufügen");
		setSize(400, 200);
		setLocation(-1100, 1200); // 
//		setLocation(500, 200);
		  setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		nameTextFeld.setFont(new Font("Verdana",Font.PLAIN,30));
		nameTextFeld.setBounds(270, 100, 140, 30);
		add(nameTextFeld);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Komponenten();
	}

}
