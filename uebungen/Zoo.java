package uebungen;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		ArrayList<Tier> a = new ArrayList<Tier>();
		a.add(new Loewe("Samba", 5));
		a.add(new Papagei("Polly", 6));
		a.add(new Delfin("Flipper", 5));
		
		for(Tier t : a) {
			t.lautGeben();
			t.schlafen();
		}
		
	}

}

abstract class Tier {
    protected String name;
    protected int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void schlafen() {
        System.out.println(name + " schläft.");
    }

    public abstract void lautGeben();
}
			    class Loewe extends Tier {
			    public Loewe(String name, int alter) {
			        super(name, alter);
			    }

			    @Override
			    public void lautGeben() {
			        System.out.println(name + " brüllt.");
			    }
			}


  class Papagei extends Tier{
	  public Papagei(String name, int alter) {
	        super(name, alter);
	    }

	    @Override
	    public void lautGeben() {
	        System.out.println(name + " brüllt.");
	    }
	}
class Delfin extends Tier{
	public Delfin(String name, int alter) {
        super(name, alter);
    }

    public void lautGeben() {
        System.out.println(name + " quietscht.");
    }
}



