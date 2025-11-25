package p.g;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelMitWeiterenEigenschaften extends JFrame {

	private JLabel ueberschriftenLab = new JLabel();
	
	public LabelMitWeiterenEigenschaften() {
//		super();
		setSize(500, 650);
		setLocation(-1100, 1200); // (Monitor f. Teams befindet sich rechts vom gr. Hauptbildschirm)
//		setLocation(500, 200);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ueberschriftenLab.setFont(new Font("Verdana",Font.BOLD,20));
		ueberschriftenLab.setForeground(Color.BLUE);
//		setbounds wird hier ignoriert: vertikal zentriert, horizontal linksbündig:
		ueberschriftenLab.setBounds(180, 40, 100, 5); // Moves and resizes this component. The new location of the top-left corner is specified by x and y, and the new size is specified by width and height.
	    ueberschriftenLab.setBounds(20, 40, 150, 40); // 20, 40, 150, 40
//		ueberschriftenLab.setHorizontalAlignment(/*JFrame.*/CENTER_ALIGNMENT); // nicht se8
//		ueberschriftenLab.setHorizontalAlignment(JLabel.CENTER);
//		ueberschriftenLab.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
		ueberschriftenLab.setText("Fragebogen");
		this.add(ueberschriftenLab);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelMitWeiterenEigenschaften();
		
	}

}
