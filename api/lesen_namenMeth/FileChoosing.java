package api;

import java.io.File;

import javax.swing.JFileChooser;

public class FileChoosing {

	public static void main(String[] args) {
		new JFileChooser();
		
		File selektiertesFile = null;
		JFileChooser file = new JFileChooser("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachNameWin.csv");
		file.setDialogTitle("Bitte ein Verzeichnis wählen.");
//		file.setFileSelectionMode(1); // Dirs
		file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		file.showOpenDialog(file);
//		file.showDialog(null,"Drück mich"); // Rückgabewert
		int returnWert = file.showDialog(null,"Drück mich");
//		if (returnWert==0) {
		if (returnWert==JFileChooser.APPROVE_OPTION) {
			selektiertesFile=file.getSelectedFile();
		}
		System.out.println("Sie haben die Dir "+selektiertesFile+" gewählt");
	}

}
