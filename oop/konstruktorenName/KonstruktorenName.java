package oop.konstruktorenName;

import java.util.ArrayList;

public class KonstruktorenName {

	public static void main(String[] args) {
		
		String namen = "Vorname;Nachname\r\n" // CopyPaste aus Excel
				+ "Hansi;Überseer\r\n"
				+ "Claudia;Meier\r\n"
				+ "Peter;Müller";
		
		ArrayList <Person> personenListe = new ArrayList<>();
		  for (String zeile : namen.split("\r\n")) {
		     String[] teile = zeile.split(";");
		     personenListe.add(new Person(teile[0], teile[1]));
		 }


		for (Person p : personenListe) {
		    System.out.println(p);
		}
		
//		Übung: Bitte erstellen Sie eine Klasse mit Namen "Person". Sie enthält 2 fields: vorname und nachname.
//		Verwenden Sie eine Konstruktor, der 2 Strings nimmt und den Inhalt in den passenden Attributen speichert - KEINE Arrays.
//		Speichern Sie die Personen-Objekte in einer passenden ArrayList und geben Sie sie anschl. alle in der Console aus.
		
	}

}
class Person {
		String vorname;
		String nachname;
		
Person (String vorname,String nachname ) {
	this.nachname = nachname;
	this.vorname = vorname;
}

   @Override
public String toString() {
    return vorname + " " + nachname;

}
}

