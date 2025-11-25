package api.lesen_namenMeth;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;



public class LesenNamenMeth {

	public static void main(String[] args) throws IOException {

		File quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\lesen_namen\\VorUndNachName.csv");
		/* File */ quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\lesen_namen\\VorUndNachName.csv"); // Win mit Windows-1252 ist OK

		List<String> inhalt = Files.readAllLines(quelle.toPath(), StandardCharsets.ISO_8859_1);
	     List<Person> personen = new ArrayList<>();

	     for (int i = 1; i < inhalt.size(); i++) {//Мы начинаем цикл с i = 1, а не с i = 0, 
	    	                                      //чтобы пропустить первую строку ("Vorname;Nachname").


	    	    String zeile = inhalt.get(i);
	    	    String[] teile = zeile.split(";");
	    	    if (teile.length >= 2) {
	    	        Person person = new Person(teile[0].trim(), teile[1].trim());
	    	        personen.add(person);
	    	    }
	    	}
	   
	        for (Person p : personen) {
	            System.out.println(p);
		
	        }
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
