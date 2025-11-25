package p.g;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fragebogen_Zeichnen_mitVarUndActionAK  extends JFrame {

	private JTextField pathField = new JTextField();
	
	private JButton absendeBtn = new JButton();
	private JButton sucheBtn = new JButton();
	private JButton abbrechenBtn = new JButton();
	
	private JCheckBox pfadFrag = new JCheckBox();
	private JTextField pfadFrag1 = new JTextField();
	
	private JCheckBox extension = new JCheckBox();
	private JTextField extension1 = new JTextField();
	
	private JCheckBox laenge = new JCheckBox();
	private JTextField laenge1 = new JTextField();
	
	
	private JTextArea summaryTextA = new JTextArea();
	
	
	
	
	public Fragebogen_Zeichnen_mitVarUndActionAK() {
		super ("File Search");
		setSize(800, 900);
		setLocation(-1100, 1200); //
		setLayout(null);
		
		int x=20;
		int y=100;
		
		
		Font unserFont = new Font("Verdana", Font.PLAIN, 16);
		absendeBtn.setFont(unserFont);
	    absendeBtn.setBounds(x, y, 230, 30);
	    absendeBtn.setText("Verzeichnis wählen");
	    add(absendeBtn);
	    add(pathField);

	    pathField.setBounds(270, y, 400, 30); // координаты и размер
	    pathField.setFont(unserFont);
	    
        sucheBtn.setFont(unserFont);
        sucheBtn.setBounds(x, 750, 150, 30);
        sucheBtn.setText("Suchen");
	    add(sucheBtn);
	    
	    abbrechenBtn.setFont(unserFont);
	    abbrechenBtn.setBounds(370, 750, 150, 30);
	    abbrechenBtn.setText("Abbrechen");
	    add(abbrechenBtn);
	    
	    pfadFrag1.setFont(unserFont);
	    pfadFrag.setFont(unserFont);
	    pfadFrag.setBounds(x, 150, 180, 30);
	    pfadFrag.setText("Dateiname enthält:");
	    pfadFrag1.setBounds(x, 200, 230, 30);
	   	add(pfadFrag);
	    add(pfadFrag1);
	    
	    extension.setFont(unserFont);
	    extension.setFont(unserFont);
	    extension.setBounds(x, 250, 300, 30);
	    extension.setText("Extension (z.B. java, txt):");
	    extension1.setBounds(x, 300, 230, 30);
	   	add(extension);
	    add(extension1);
	    
	    laenge.setFont(unserFont);
	    laenge.setFont(unserFont);
	    laenge.setBounds(x, 350, 300, 30);
	    laenge.setText("Dateigröße (KB, min-max):");
	    laenge1.setBounds(x, 400, 230, 30);
	   	add(laenge);
	    add(laenge1);
	    
	    summaryTextA.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,16));
	    summaryTextA.setForeground(Color.BLUE);
	    summaryTextA.setBounds(x, 450, 650, 240);
	    summaryTextA.setEditable(false);
	    add(summaryTextA);
	    

		    setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
		
		absendeBtn.addActionListener(e -> {
	            JFileChooser chooser = new JFileChooser();
	            chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // 
	            chooser.setCurrentDirectory(new File("C:\\Users\\User\\eclipse-workspace\\j_2506"));               // стартовать с диска C:\

	            int result = chooser.showOpenDialog(this);

	            if (result == JFileChooser.APPROVE_OPTION) {
	                File selectedDir = chooser.getSelectedFile();
	            	pathField.setText(selectedDir.getAbsolutePath());
	            	
	            	
	            	
	            	summaryTextA.setText(selectedDir.getAbsolutePath());
	            }
	        });
		
	    

	    sucheBtn.addActionListener(e -> {
	    	summaryTextA.setText(""); // очистить старый вывод
	        String path = pathField.getText();

	        if (path.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Bitte wählen Sie ein Verzeichnis!");
	            return;
	        }
	        File dir = new File(path);
	        if (!dir.exists() || !dir.isDirectory()) {
	            JOptionPane.showMessageDialog(this, "Ungültiges Verzeichnis!");
	            return;
	        } 
	            summaryTextA.append("Verzeichnis: " + path + "\n");
	            if (pfadFrag.isSelected()) {
	                summaryTextA.append("Name enthält: " + pfadFrag1.getText() + "\n");
	            }
	            if (extension.isSelected()) {
	                summaryTextA.append("Extension: " + extension1.getText() + "\n");
	            }
	            if (laenge.isSelected()) {
	                summaryTextA.append("Größe: " + laenge1.getText() + " KB\n");
	            }
	            summaryTextA.append("\nGefundene Dateien:\n");


        searchFiles(dir);
    });

    // Действие для Abbrechen
	    abbrechenBtn.addActionListener(e -> System.exit(0));

    setVisible(true);
}

private void searchFiles(File dir) {
    File[] files = dir.listFiles();
    if (files == null) return;

    for (File f : files) {
        if (f.isDirectory()) {
            searchFiles(f); // рекурсивно искать в подпапках
        } else {
            if (matchesFilters(f)) {
                summaryTextA.append(f.getAbsolutePath() + "\n");
            }
        }
    }
}

private boolean matchesFilters(File file) {
    // Проверка имени
    if (pfadFrag.isSelected()) {
        String keyword = pfadFrag1.getText().trim().toLowerCase();
        if (!file.getName().toLowerCase().contains(keyword)) {
            return false;
        }
    }

    // Проверка расширения
    if ( extension.isSelected()) {
        String ext =  extension1.getText().trim().toLowerCase();
        if (!file.getName().toLowerCase().endsWith("." + ext)) {
            return false;
        }
    }

    // Проверка размера
    if (laenge.isSelected()) {
        try {
            String[] parts = laenge1.getText().split("-");
            long min = Long.parseLong(parts[0].trim()) * 1024; // KB → Bytes
            long max = Long.parseLong(parts[1].trim()) * 1024;
            long length = file.length();
            if (length < min || length > max) {
                return false;
            }
        } catch (Exception e) {
            summaryTextA.append("Fehler beim Lesen der Dateigröße: " + laenge1.getText() + "\n");
        }
    }

    return true;
}


	public static void main(String[] args) {
		new Fragebogen_Zeichnen_mitVarUndActionAK();

	}
}