package p.g;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelPosProblem extends JFrame {

	private JLabel ueberschriftenLab = new JLabel();
	
	public LabelPosProblem() {
//		super();
		setSize(500, 650);
//		setLocation(-1100, 1200); // 
		 setLocation(500, 200);
		    setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ueberschriftenLab.setFont(new Font("Verdana",Font.BOLD,20));
		ueberschriftenLab.setForeground(Color.BLUE);
//		setbounds wird hier ignoriert: vertikal zentriert, horizontal linksbündig:
		 ueberschriftenLab.setBounds(80, 40, 150, 5);
//		ueberschriftenLab.setBounds(80, 40, 15, 5); // Moves and resizes this component. The new location of the top-left corner is specified by x and y, and the new size is specified by width and height.
//		ueberschriftenLab.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
		ueberschriftenLab.setText("Fragebogen");
		add(ueberschriftenLab);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelPosProblem();
		
	}

}
