package Dos;

import java.io.File;
import javax.swing.JOptionPane;

public class DosTest {

	public static void main(String[] args) {
		File f = new File("hallo");
		JOptionPane.showMessageDialog(null, f.exists());
	}

}
