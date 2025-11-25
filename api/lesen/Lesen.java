package api.lesen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lesen {

	public static void main(String[] args) throws IOException { // ist Eltern von FileNotFound-Exception
		{
			File quelle = new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen\\text.txt");
			System.out.println(quelle.isDirectory());
			System.out.println(quelle.isFile());
			FileReader fReader;
			fReader = new FileReader(quelle); // CF: String- oder File-Object an null nicht erkennbar
			BufferedReader bReader = new BufferedReader(fReader);
			System.out.println(bReader.readLine());
			System.out.println(bReader.readLine());
			bReader.close();
		} // GC
		{
			File quelle = new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen\\text.txt");
			BufferedReader bReader = new BufferedReader( new FileReader(quelle));
			String zeile = bReader.readLine();
			while (zeile != null) { // null if the end of the stream has been reached
				System.out.println(zeile);
				zeile = bReader.readLine();
			}
			bReader.close();
		}
	}
}