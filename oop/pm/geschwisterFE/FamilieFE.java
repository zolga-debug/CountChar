package oop.pm.geschwisterFE;

import java.util.ArrayList;

public class FamilieFE {

	public static void main(String[] args) {
		Eltern papa = new Eltern();
		papa.name = "Kurt";
		Eltern mama = new Eltern();
		mama.name = "Karoline";
		Bruder b1 = new Bruder();
		b1.name = "Hans";
		Schwester s1 = new Schwester();
		s1.name = "Nikole";
		Nachbar n1 = new Nachbar();
		n1.name = "Klaus";
		
		ArrayList<Mensch>gaeste = new ArrayList<Mensch>();
		gaeste.add(n1);
		gaeste.add(s1);
	    gaeste.add(b1);
	    gaeste.add(mama);
	    gaeste.add(papa);
	    for (Mensch element : gaeste) {
	    	System.out.println(element);
	    	
	    }
	
	
	}

}
class Mensch{String name; // OOP: Vererbung => nur geringer Modifikationsaufwand bei sich ändernder Spezifikation
//class Mensch{String vorName;String nachName;} // OOP: Vererbung => nur geringer Modifikationsaufwand bei sich ändernder Spezifikation
   @Override
public String toString() {
	return "Ich bin " + getClass().getSimpleName() + " und mein Name ist " + name+".";
   }
}

class Eltern extends Mensch{}
class Bruder extends Eltern{}
class Schwester extends Eltern{}
class Nachbar extends Mensch{}

