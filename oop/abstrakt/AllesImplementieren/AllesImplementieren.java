package oop.abstrakt.AllesImplementieren;

public class AllesImplementieren {

}
//abstract class Eltern{
//	abstract void m1();
//	}
//abstract class Kind extends Eltern{
//	abstract void m2();
//	} 
//class Enkel extends Kind{
//	void m1() {} void m2(){} 
//	}

class Tier {}
abstract class Canine extends Tier{
	abstract void m();
	}
 class Hund extends Canine{
	void m() {
	} 
	} 
 class Wolf extends Canine{
	void m() {} 
	}
  

// Übung: Bitte sorgen Sie durch Implementieren dafür, dass der CF verschwindet.