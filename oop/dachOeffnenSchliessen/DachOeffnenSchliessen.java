package oop.dachOeffnenSchliessen;

public class DachOeffnenSchliessen { 
//	umfangreiche Übung

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.setName("Susi");
		
		a1.beschleunigen();
		System.out.println(a1);
		a1.bremsen();
		a1.bremsen(); // Lebenswirklichkeit abbilden
		System.out.println(a1);
		
		Cabrio c1 = new Cabrio();
		c1.setName("Otto");
		c1.beschleunigen();
		System.out.println(c1);
		c1.beschleunigen();
		c1.oeffneDach(); // Es reicht, das field zu verändern
		System.out.println(c1);
		c1.beschleunigen();
		c1.schliesseDach();
		c1.schliesseDach(); // Absicherung in M. aufnehmen, da Dach schon geschlossen ist.
		System.out.println(c1);
		c1.anhalten();
		System.out.println(c1);
	}

}
class Auto{
//	Übung: Bitte kapseln Sie die Attribute.
	private String name;
	
	private int geschwindigkeit;
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
        return name;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
	
	
	public void beschleunigen() {
		 
		geschwindigkeit++;
	}
	public void bremsen() {
		if (geschwindigkeit>0) {
		
		geschwindigkeit --;
	}
		}
	public String toString() {  
		return "Ich heisse "+ name + " und fahre gerade " + geschwindigkeit;
	}
}

class Cabrio extends Auto{ // Kind kann alles, was Eltern kann und noch mehr
	boolean dachOffen;
	
	public void oeffneDach() {
        if (!dachOffen) {
            dachOffen = true;
        }
    }

    public void schliesseDach() {
        if (dachOffen) {
            dachOffen = false;
        } else {
            System.out.println("Dach ist schon geschlossen!");
        }
    }

    public boolean isDachOffen() {
        return dachOffen;
    }
    public void anhalten() {
        while (getGeschwindigkeit() > 0) {
            bremsen();
        }
    }

    @Override
    public String toString() {
        String dachStatus = dachOffen ? "offen" : "geschlossen";
        return super.toString() + " und das Dach ist gerade " + dachStatus;
//        @Override
//    	public String toString() {
//    		return super.toString()+" und das Dach ist gerade "+ (dachOffen ?"offen" :"geschlossen");
//    	}
//    
    }
    
}
