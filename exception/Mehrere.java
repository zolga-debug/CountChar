package exception;

import java.util.Random;

class MeineA extends /*Runtime*/Exception{}

	
class MeineB extends /*Runtime*/Exception{}

public class Mehrere {

	public static void main(String[] args) {
		Mehrere m = new Mehrere();
		try {
			m.mehrere(); // line 1
		}catch (MeineA e) {
			System.out.println("Typ A wurde gefangen");
		}catch (MeineB e) {
			System.out.println("Typ B wurde gefangen");
		}
		
		
	}
	void mehrere() throws MeineA, MeineB { // mit diesem Text erscheint CF in line 1
		Random rand = new Random();
		int zufall = rand.nextInt(3);
		System.out.println(zufall);
		if(zufall == 0) {
			//Nix werfen
		}else if(zufall == 1) {
			throw new MeineA();
		}else if(zufall == 2) {
			throw new MeineB();
		}
	}
}
	
	
	
	