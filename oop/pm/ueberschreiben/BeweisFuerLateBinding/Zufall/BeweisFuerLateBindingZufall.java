package oop.pm.ueberschreiben.BeweisFuerLateBinding.Zufall;

import java.util.Random;

//@formatter:off
class Auto {public String toString() {return "Auto";}}
class Cabrio extends Auto {public String toString() {return "Cabrio";}}
//@formatter:on
public class BeweisFuerLateBindingZufall {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Cabrio cabrio = new Cabrio();
		Auto ac = auto; // PM vorbereiten
		
		for(int i=0; i<10;i++) {
			if(new Random().nextBoolean()) {
				ac = cabrio;
			}else {
				ac=auto;
			}
			System.out.println(ac);
		}
	}

}
