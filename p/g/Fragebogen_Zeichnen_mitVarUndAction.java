package p.g;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fragebogen_Zeichnen_mitVarUndAction extends JFrame {

	private JLabel ueberschriftenLab = new JLabel();
	private JLabel nameLab = new JLabel();
	private JTextField nameTextF = new JTextField();
	private JCheckBox javaChkbox = new JCheckBox();
	private JCheckBox csharpChkbox = new JCheckBox();
	private JCheckBox cppChkbox = new JCheckBox();
	private JTextArea summaryTextA = new JTextArea();
	private JButton absendeBtn = new JButton();

	public Fragebogen_Zeichnen_mitVarUndAction() {
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
       // cppChkbox.action(a, unserFont)
	    add(cppChkbox);
	    
	    y+=vertikalerAbstand;
	    summaryTextA.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,16));
	    summaryTextA.setForeground(Color.BLUE);
	    summaryTextA.setBounds(x, y, 350, 240);
	    summaryTextA.setEditable(true);
	    
	    add(summaryTextA);
	    
	    absendeBtn.setFont(unserFont);
	    absendeBtn.setBounds(280, 250, 130, 30);
	    absendeBtn.setText("Absenden");
	    add(absendeBtn);
	    setVisible(true);
	    
	    
	    
//	    Übung: Bitte lesen Sie die Objekte aus (Häkchen und Namensfeld) und schreiben eine Text in das AUsgabefeld
//	    z.B.:
//	    Harald hat Kenntnisse in den folgenden Programmiersprachen:
//	    	- Java
//	    	- C#
	   
	    
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		absendeBtn.addActionListener(e -> {
            String name = nameTextF.getText().trim();
            StringBuilder sb = new StringBuilder();

            if (name.isEmpty()) {
                sb.append("Bitte einen Namen eingeben!\n");
            } else {
                sb.append(name).append(" hat Kenntnisse in den folgenden Programmiersprachen:\n");
            }

            if (javaChkbox.isSelected()) sb.append(" - Java\n");
            if (csharpChkbox.isSelected()) sb.append(" - C#\n");
            if (cppChkbox.isSelected()) sb.append(" - C++\n");

            summaryTextA.setText(sb.toString());
        });
//		absendeBtn.addActionListener(e -> {
//	    	summaryTextA.setText(nameTextF.getText() + " hat Kenntnisee in den \nfolgenden Programmiersprachen:");
//	    	if(javaChkbox.isSelected())
//	    		summaryTextA.append("\n"+javaChkbox.getName());
//	    	if(csharpChkbox.isSelected())
//	    		summaryTextA.append("\n"+csharpChkbox.getName());
//	    	if(cppChkbox.isSelected())
//	    		summaryTextA.append("\n"+cppChkbox.getName());
//	    });
//    
//	    absendeBtn.addActionListener(e -> summaryTextA.setText(nameTextF.getText()+" hat Kenntinisse in\n"+
//				(javaChkbox.isSelected()   ?"- Java\n":"")+
//				(csharpChkbox.isSelected() ?"- C#\n" :"")+
//				(cppChkbox.isSelected()    ?"- C++\n" :"")));

//		absendeBtn.addActionListener(e -> {	
//    		String javaTxt = javaChkbox.isSelected() ? "\n- Java" : "";
//    		String csharpTxt = csharpChkbox.isSelected() ? "\n- C#" : "";
//    		String cppTxt = cppChkbox.isSelected() ? "\n- C++" : "";
//    		
//    		summaryTextA.setText(nameTextF.getText() + " hat Kenntnisse in:" + javaTxt + csharpTxt + cppTxt);
//    });
//		  
	}

	public static void main(String[] args) {
		new Fragebogen_Zeichnen_mitVarUndAction();

	}
}