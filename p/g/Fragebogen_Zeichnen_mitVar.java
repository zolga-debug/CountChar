package p.g;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fragebogen_Zeichnen_mitVar extends JFrame{

	private JLabel ueberschriftenLab = new JLabel();
	private JLabel nameLab = new JLabel();
	private JTextField nameTextF = new JTextField();
	private JCheckBox javaChkbox = new JCheckBox();
	private JCheckBox csharpChkbox = new JCheckBox();
	private JCheckBox cppChkbox = new JCheckBox();
	private JTextArea summaryTextA = new JTextArea();
	private JButton absendeBtn = new JButton();

	public Fragebogen_Zeichnen_mitVar() {
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
		int vertikalerAbstand=50;
		Font unserFont = new Font("Verdana", Font.PLAIN, 16);
		nameLab.setFont(unserFont);
//		nameLab.setForeground(Color.BLUE); // default ist schwarz
		nameLab.setBounds(x, y, 230, 30);
		nameLab.setText("Bitte den Namen eintragen");
		add(nameLab);
		
		nameTextF.setFont(unserFont);
		nameTextF.setBounds(270, y, 140, 30);
		add(nameTextF);
		
		y+=vertikalerAbstand;
	    javaChkbox.setFont(unserFont);
	    javaChkbox.setBounds(x, y, 180, 30);
	    javaChkbox.setText("Kenntnisse in Java");
	    add(javaChkbox);
		
	    y+=vertikalerAbstand;
	    csharpChkbox.setFont(unserFont);
	    csharpChkbox.setBounds(x, y, 180, 30);
	    csharpChkbox.setText("Kenntnisse in C#");
	    add(csharpChkbox);
	    
	    y+=vertikalerAbstand;
	    cppChkbox.setFont(unserFont);
	    cppChkbox.setBounds(x, y, 180, 30);
	    cppChkbox.setText("Kenntnisse in C++");
	    add(cppChkbox);
	    
	    y+=vertikalerAbstand;
	    summaryTextA.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,20));
	    summaryTextA.setForeground(Color.BLUE);
	    summaryTextA.setBounds(x, y, 350, 240);
	    summaryTextA.setEditable(true);
	    add(summaryTextA);
	    
	    absendeBtn.setFont(unserFont);
	    absendeBtn.setBounds(280, 250, 130, 30);
	    absendeBtn.setText("Absenden");
	    add(absendeBtn);
	    
	    
	    
	    
	    
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Fragebogen_Zeichnen_mitVar();

	}
}