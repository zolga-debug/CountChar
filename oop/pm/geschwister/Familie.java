package oop.pm.geschwister;

import java.util.ArrayList;

public class Familie {

	public static void main(String[] args) {
		Eltern e1 = new Schwester(); // PM
//		Schwester s1 =  e1; // CF: 
		Schwester s1 =  (Schwester) e1; //  

		System.out.println(s1); // oop.pm.geschwister.Schwester@15db9742
		
		Eltern e2 = new Bruder();
	//	Mensch[]familie = {new Schwester(), new Bruder(), new Nachbar(), new Eltern()};
		ArrayList <Mensch> name = new ArrayList<>();
		name.add(e1);
		name.add(s1);
		System.out.println(name);
		
//		Übung: Bitte speichern Sie Eltern-, Bruder-, Schwester- und Nachbar-Objekte in einer ArrayList, auf die die Objekt-Variabel gaeste zeigt.
//		Geben Sie in der Konsole alle eingeladenen Personen mit ihrem Namen aus.
		
	}
}
class Mensch{String name;} // OOP: Vererbung => nur geringer Modifikationsaufwand bei sich ändernder Spezifikation
//class Mensch{String vorName;String nachName;} // OOP: Vererbung => nur geringer Modifikationsaufwand bei sich ändernder Spezifikation
class Eltern extends Mensch{}
class Bruder extends Eltern{}
class Schwester extends Eltern{}
class Nachbar extends Mensch{}