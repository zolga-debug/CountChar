package p.g.TopDown;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenueMitEintraegen {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 400);
		frame.setLocation(-1100, 1200); //
		frame.setLayout(null);
		frame.setTitle("Dies ist die Titelleiste");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//	    -----------------------------------------------------
	    JMenuBar bar = new JMenuBar();
	    JMenu menu = new JMenu("Datei");
	    JMenuItem item1 = new JMenuItem("Öffnen");
	    JMenuItem item2 = new JMenuItem("Speichern");
	    menu.add(item1);
	    menu.add(item2);
	    bar.add(menu);
	    frame.setJMenuBar(bar); // Achtung: J
//	    -----------------------------------------------------
	    frame.setVisible(true);
	}

}
