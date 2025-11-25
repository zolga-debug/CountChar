package api.lesen_namenKA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class Person {
	String nachName;
	String vorName;
 
	public Person(String vorName, String nachName) {
		this.vorName = vorName;
		this.nachName = nachName;
	}
 
	@Override
	public String toString() {
		return vorName + " " + nachName;
	}
}
 
class LesenKA {
 
	public static void main(String[] args) throws IOException {
 
		File quelle = new File("src/api/lesen/VorUndNachName.csv");
		/*File*/ quelle = new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachName.csv");
		BufferedReader bReader = new BufferedReader(new FileReader(quelle));
		bReader.readLine();// Um die Überschrift zu überspringen
		String zeile = bReader.readLine();
 
		ArrayList<Person> personen = new ArrayList<Person>();
 
		while (zeile != null) {
			String[] name = zeile.split(";");
			personen.add(new Person(name[0], name[1]));
			zeile = bReader.readLine();
		}
		bReader.close();
 
		Random r = new Random();
 
		for (Person p : personen) {
			System.out.print("Hallo " + p + ", ");
			switch (r.nextInt(3)) {
			case 0:
				System.out.println("ich grüße Dich.");
				break;
			case 1:
				System.out.println("wie geht es Dir?");
				break;
			case 2:
				System.out.println("alles fit bei Dir?");
			default:
				break;
			}
		}
	}
 
}
 
 