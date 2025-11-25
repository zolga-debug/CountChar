package p.g.TopDown;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenueMitAction {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		frame.setLocation(-1100, 1200); //
		frame.setLayout(null);
		frame.setTitle("Dies ist ein Beispiel für die TopDown-Entwicklung");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//	    -----------------------------------------------------
	    JMenuBar bar = new JMenuBar();
	    JMenu menu = new JMenu("Datei");
	    JMenuItem item1 = new JMenuItem("Öffnen");
	    JMenuItem item2 = new JMenuItem("Speichern");
	    JMenuItem item3 = new JMenuItem("Beenden");
	    menu.add(item1);
	    menu.add(item2);
	    menu.add(item3);
	    bar.add(menu);
	    frame.setJMenuBar(bar); // Achtung: J
//	    -----------------------------------------------------
//	    Aktion mit anonymer Klasse realisieren
	    item1.addActionListener(new ActionListener() { // Adden findet erst nach dem Zufügen zum Menü statt. Nachträgliche Erweiterungen funktionieren.
			@Override
			public void actionPerformed(ActionEvent e) {
				nichtInstalliertMeldung();
			}
		});
//	    -----------------------------------------------------
//	    Aktion mit Lambda-Ausdruck realisieren
//	    Übung: Bitte Action f. item2 mit Lambda-Ausdruck realisieren
//	    item2.addActionListener(e -> nichtInstalliertMeldung());	 // DA   
	    item2.addActionListener(e -> AndereMain.main(null));	 // DA   
//	    -----------------------------------------------------
//	    Aktion mit Klasse realisieren, die Interface erweitert
	    item3.addActionListener(new ActionListenerBeenden());
	    
	    
//	    -----------------------------------------------------
	    frame.setVisible(true);
	}
	static void nichtInstalliertMeldung() {
		JOptionPane.showMessageDialog(null, "Menüpunkt ist noch nicht installiert");
	}
}
class ActionListenerBeenden implements ActionListener{
	public void actionPerformed(ActionEvent e) {
//		MenueMitAction.nichtInstalliertMeldung();
		System.exit(0);
	}
}


