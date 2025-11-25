package p.g;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fragebogen_Zeichnen extends JFrame {
	private JLabel ueberschriftenLab = new JLabel();
	private JLabel nameLab = new JLabel();
	private JTextField nameTextF = new JTextField();
	private JCheckBox javaChkbox = new JCheckBox();
	private JCheckBox csharpChkbox = new JCheckBox();
	private JCheckBox cppChkbox = new JCheckBox();
	private JTextArea summaryTextA = new JTextArea();
	private JButton absendeBtn = new JButton();

	public Fragebogen_Zeichnen() {
		setSize(500, 650);
		setLocation(-1100, 1200); //
		setLayout(null);

		ueberschriftenLab.setFont(new Font("Verdana", Font.BOLD, 20));
		ueberschriftenLab.setForeground(Color.BLUE);
		ueberschriftenLab.setBounds(20, 40, 150, 40); // x,y,B,H
		ueberschriftenLab.setText("Fragebogen");
		/*this.*/add(ueberschriftenLab);
		
		int x=20;
		int y=100;
		nameLab.setFont(new Font("Verdana", Font.PLAIN, 16));
//		nameLab.setForeground(Color.BLUE);
		nameLab.setBounds(x, y, 230, 30);
		nameLab.setText("Bitte den Namen eintragen");
		add(nameLab);
		
		nameTextF.setFont(new Font("Verdana",Font.PLAIN,16));
		nameTextF.setBounds(270, y, 140, 30);
		add(nameTextF);
		
		y+=50;
	    javaChkbox.setFont(new Font("Verdana",Font.PLAIN,16));
	    javaChkbox.setBounds(x, y, 180, 30);
	    javaChkbox.setText("Kenntnisse in Java");
	    add(javaChkbox);
		
	    y+=50;
	    csharpChkbox.setFont(new Font("Verdana",Font.PLAIN,16));
	    csharpChkbox.setBounds(x, y, 180, 30);
	    csharpChkbox.setText("Kenntnisse in C#");
	    add(csharpChkbox);
	    
	    y+=50;
	    cppChkbox.setFont(new Font("Verdana",Font.PLAIN,16));
	    cppChkbox.setBounds(x, y, 180, 30);
	    cppChkbox.setText("Kenntnisse in C++");
	    add(cppChkbox);
	    
	    y+=50;
	    summaryTextA.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,20));
	    summaryTextA.setForeground(Color.BLUE);
	    summaryTextA.setBounds(x, y, 350, 240);
	    summaryTextA.setEditable(false);
	    add(summaryTextA);
	    
	    absendeBtn.setFont(new Font("Verdana",Font.PLAIN,16));
	    absendeBtn.setBounds(280, 250, 130, 30);
	    absendeBtn.setText("Absenden");
	    add(absendeBtn);
	    
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Fragebogen_Zeichnen();

	}
}