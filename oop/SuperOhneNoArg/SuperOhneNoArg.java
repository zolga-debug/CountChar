package oop.SuperOhneNoArg;

public class SuperOhneNoArg {
	public static void main(String[] args) {
		new Tier(1);
//		new Tier();
	}
}

class Tier {
	private int age;

	Tier(int age) {
		this.age = age;
	}
	
    Tier(){}
}

class Zebra extends Tier { // CF: Implicit super constructor Tier() is undefined for default constructor. Must define an explicit constructor
//	Zebra(){
//		super(); // Implicit super constructor Tier()
//	}
}