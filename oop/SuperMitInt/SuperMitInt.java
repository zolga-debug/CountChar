package oop.SuperMitInt;

public class SuperMitInt {

	public static void main(String[] args) {
		new Tier(1);
	}
}

class Tier {
	private int age;

	Tier(int age) {
		this.age = age;
	}
}

class Zebra extends Tier { 
	Zebra(){
		super(2); 
	}
}