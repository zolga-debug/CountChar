package api.lesen_namenCB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class LesenCB {
 
	public static void main(String[] args) throws IOException {
 
		File quelle = new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachName.csv");
 
		/* Problems with ü -> other character-set */
		BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(quelle), "Windows-1252")); // public InputStreamReader(InputStream in, String charsetName)
 
		String readedLine = bReader.readLine();
		System.out.println("Ist das die Überschrift?"+readedLine);
 
		ArrayList<Person> personList = new ArrayList<>();
 
		/* seperate firstname and lastname, build Peron-Object and store in ArrayList */
		while (readedLine != null) {
			int separatorIndex = readedLine.indexOf(';');
			String firstName = readedLine.substring(0, separatorIndex);
			String lastName = readedLine.substring(separatorIndex + 1);
 
			if (!firstName.equals("Vorname")) { // 
				Person person = new Person(firstName, lastName);
				personList.add(person);
			}
			readedLine = bReader.readLine();
		}
 
		/* Output */
		for (Person personOut : personList) {
			System.out.println(personOut); // toString beachten
		}
		bReader.close();
	}
}
 
class Person {
	String firstName;
	String lastName;
 
	public Person() {
	}
 
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
 
	public String toString() {
		return "HeyHo, Let`s go " + firstName + " " + lastName;
	}
}
 