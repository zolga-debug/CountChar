package p.g;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OCAExplorer extends JFrame {

	private JButton waehlenButton = new JButton();
	private JButton durchsuchenButton = new JButton();
	private JTextField verzFeld = new JTextField();
	private JTextField fragmentFeld = new JTextField();
	private JLabel fragmentLabel = new JLabel();
	private JTextField extensionFeld = new JTextField();
	private JLabel extensionLabel = new JLabel();
	private JTextField groesseMinFeld = new JTextField();
	private JTextField groesseMaxFeld = new JTextField();
	private JLabel groesseLabel = new JLabel();
	private JTextField startDatumFeld = new JTextField();
	private JTextField endDatumFeld = new JTextField();
	private JLabel datumLabel = new JLabel();
	private JCheckBox genaueSucheChk = new JCheckBox();
	private JFileChooser fileChooser = new JFileChooser();
	private JLabel datumVonLabel = new JLabel();
	private JLabel datumBisLabel = new JLabel();
	private JLabel groesseVonLabel = new JLabel();
	private JLabel groesseBisLabel = new JLabel();
	private JLabel suchBeschreibung = new JLabel();
	private JLabel extensionBeschreibung = new JLabel();
	private JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
 
	public OCAExplorer() {
		super("File Search");
		setSize(400, 800);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setBackground(Color.GRAY);
		
		Font fontLabel = new Font("Verdana", Font.BOLD, 12);
		Font fontField = new Font("Verdana", Font.BOLD, 10);
		
		int x = 50;
		int y = 20;
		
		//Verzeichnis Bereich
		verzFeld.setFont(fontField);
		verzFeld.setBounds(230 ,y ,120 ,25);
		verzFeld.setText("C:\\Users\\User\\eclipse-workspace\\j_2506");
//		verzFeld.setText("C:\\Users\\klaan\\OneDrive\\Dokumente\\Programmieren\\OCA");
		add(verzFeld);
		
		waehlenButton.setFont(fontLabel);
		waehlenButton.setBounds( 30, y, 180, 25);
		waehlenButton.setText("Verzeichnis wählen");
		add(waehlenButton);
		
		//Dateiendungs Bereich
		y += 50;
		extensionLabel.setFont(fontLabel);
		extensionLabel.setBounds(x, y, 180, 25);
		extensionLabel.setText("Dateiendung:");
		add(extensionLabel);
		
		extensionFeld.setFont(fontField);
		extensionFeld.setBounds(x+120, y, 180, 25);
		add(extensionFeld);
		
		extensionBeschreibung.setFont(new Font("Verdana", Font.BOLD, 9));
		extensionBeschreibung.setBounds(x+120, y+25, 180, 10);
		extensionBeschreibung.setText("z.B. .java .class usw.");
		add(extensionBeschreibung);
		
		//Suchbegriffs Bereich
		y += 50;
		fragmentLabel.setFont(fontLabel);
		fragmentLabel.setBounds(x ,y ,100 , 25);
		fragmentLabel.setText("Suchbegriffe:");
		add(fragmentLabel);
		
		fragmentFeld.setFont(fontField);
		fragmentFeld.setBounds(x+120, y, 180, 25);
		add(fragmentFeld);
		
		suchBeschreibung.setFont(new Font("Verdana", Font.BOLD, 9));
		suchBeschreibung.setBounds(x+120, y+25, 180, 10);
		suchBeschreibung.setText("Trennung durch Leerzeichen");
		add(suchBeschreibung);
		
		//Dateigrößen Bereich
		y += 50;
		groesseLabel.setFont(fontLabel);
		groesseLabel.setBounds(x, y, 180, 25);
		groesseLabel.setText("Dateigröße:");
		add(groesseLabel);
 
		groesseMinFeld.setFont(fontField);
		groesseMinFeld.setBounds(x+120, y, 85, 25);
		add(groesseMinFeld);
		
		groesseVonLabel.setFont(new Font("Verdana", Font.BOLD, 9));
		groesseVonLabel.setBounds(x+120, y+25, 85, 10);
		groesseVonLabel.setText("von");
		add(groesseVonLabel);
 
		groesseMaxFeld.setFont(fontField);
		groesseMaxFeld.setBounds(x+215, y, 85, 25);
		add(groesseMaxFeld);
		
		groesseBisLabel.setFont(new Font("Verdana", Font.BOLD, 9));
		groesseBisLabel.setBounds(x+215, y+25, 85, 10);
		groesseBisLabel.setText("bis");
		add(groesseBisLabel);
 
		//Datums Bereich
		y += 50;
		datumLabel.setFont(fontLabel);
		datumLabel.setBounds(x, y, 180, 25);
		datumLabel.setText("Datumsbereich:");
		add(datumLabel);
		
		startDatumFeld.setFont(fontField);
		startDatumFeld.setBounds(x+120, y, 85, 25);
		startDatumFeld.setText("TT.MM.YYYY");
		add(startDatumFeld);
		
		datumVonLabel.setFont(new Font("Verdana", Font.BOLD, 9));
		datumVonLabel.setBounds(x+120, y+25, 85, 10);
		datumVonLabel.setText("von");
		add(datumVonLabel);
		
		endDatumFeld.setFont(fontField);
		endDatumFeld.setBounds(x+215, y, 85, 25);
		endDatumFeld.setText("TT.MM.YYYY");
		add(endDatumFeld);
		
		datumBisLabel.setFont(new Font("Verdana", Font.BOLD, 9));
		datumBisLabel.setBounds(x+215, y+25, 85, 10);
		datumBisLabel.setText("bis");
		add(datumBisLabel);
		
		//Durchsuchen Bereich
	    y += 50;
		durchsuchenButton.setFont(fontLabel);
		durchsuchenButton.setBounds(100 ,y ,200 ,25);
		durchsuchenButton.setText("Verzeichnis durchsuchen");
		add(durchsuchenButton);
		
		//Genaue Suche Bereich
		y += 25;
	    genaueSucheChk.setFont(fontLabel);
	    genaueSucheChk.setBounds(x+100 , y, 180, 30);
	    genaueSucheChk.setText("Exakte suche");
	    add(genaueSucheChk);
	    
	    y += 50;
	    textArea.setFont(new Font("Verdana", Font.BOLD, 9));
	    scrollPane.setViewportView(textArea);
	    scrollPane.setBounds(10, y, 360, 400);
	    add(scrollPane);
		
		waehlenButton.addActionListener(e -> {
			File startDir = new File(verzFeld.getText().trim());
			fileChooser.setPreferredSize(new Dimension(400,800));
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			
			if(startDir.exists() && startDir.isDirectory()) {	
				fileChooser.setCurrentDirectory(startDir);
			}else {
				JOptionPane.showMessageDialog(this, "Pfad nicht gefunden\nVerzeichnis wird auf C:\\ gesetzt");
				startDir = new File("C:\\");
				fileChooser.setCurrentDirectory(startDir);
			}
			
			int auswahl = fileChooser.showOpenDialog(this);
			
			if(auswahl == JFileChooser.APPROVE_OPTION) {
				verzFeld.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}	
		});
		
		durchsuchenButton.addActionListener(e ->{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			File dir = new File(verzFeld.getText().trim());
			final String extension = extensionFeld.getText().trim();
			final String[] Fragments = fragmentFeld.getText().split(" ");
			final long laengeMin = Long.parseLong(groesseMinFeld.getText());
			final long laengeMax = Long.parseLong(groesseMaxFeld.getText());
			final LocalDate startDatum = LocalDate.parse(startDatumFeld.getText(), dtf);
			final LocalDate endeDatum = LocalDate.parse(endDatumFeld.getText(), dtf);
			final Boolean genau = genaueSucheChk.isSelected();
			
			Predicate<File> pf = f ->  	{
				boolean alleErfuellt = true;
				if(genau) {
					for (String fragment : Fragments) {
						if(!f.getName().contains(fragment))
							alleErfuellt = false;
					}
				}else {
					for (String fragment : Fragments) {
						if(!f.getName().toLowerCase().contains(fragment.toLowerCase()))
							alleErfuellt = false;
					}
				}
				
				return  f.getName().toLowerCase().endsWith(extension.toLowerCase()) &&
						alleErfuellt &&
						f.length() >= laengeMin &&
						f.length() <= laengeMax &&
						f.lastModified() >= LocalDateTime.of(startDatum, LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() &&
						f.lastModified() <= LocalDateTime.of(endeDatum, LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
				};
				
				dir(dir,pf);
 
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	void dir(File dir, Predicate<File> p) {
		File[] fa = dir.listFiles();
		if (fa == null) {
			return;
		}
 
		for (File e : fa) {
			if (e.isDirectory()) {
				dir(e, p);
			} else { // Datei
				tuwas(e, p);
			}
		}
	}
 
	void tuwas(File e, Predicate<File> p) {
		if (p.test(e)) {
			LocalDate datum = LocalDateTime.ofInstant(Instant.ofEpochMilli(e.lastModified()), ZoneId.systemDefault())
					.toLocalDate();
			textArea.append(e + " " + e.length() + " " + datum+"\n");
		}
	}
 


	
	
	public static void main(String[] args) {
		new OCAExplorer();

	}

}
