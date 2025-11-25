package p.g;

import javax.swing.JFrame;

public class ErstesFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing-Fenster");
		frame.setSize(400, 200); // Resizes this component so that it has width width and height height.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		System.out.println("Fertig");
	}

}
