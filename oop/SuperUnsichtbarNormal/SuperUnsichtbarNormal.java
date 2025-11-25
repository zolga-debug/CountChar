package oop.SuperUnsichtbarNormal;

public class SuperUnsichtbarNormal {
	public static void main(String[] args) {
		new Kind();
	}
}

class Eltern{
//	Eltern(){
//		super(); // geht in Object
//		System.out.println("2: Eltern-Konstruktor");
//	}
}

class Kind extends Eltern{
//	Kind () {
//		super(); // normalerweise unsichtbar
//		System.out.println("1: Kind-Konstruktor");
////		super(); // CF
//	}
}