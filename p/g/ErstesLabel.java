package p.g;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErstesLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing-Fenster");
		frame.setSize(400, 200); // Resizes this component so that it has width width and height height.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("BlaBla");
		frame.add(label);
		
		frame.setVisible(true);
	}
}
