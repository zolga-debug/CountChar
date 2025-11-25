package oop.SuperThisMitInt;

public class SuperThisMitInt {

	public static void main(String[] args) {
		new Tier(1);
		new Zebra();
		new Zebra(5);
		new Tier(); // line 1: CF
	}
}

class Tier {
	private int age;

	Tier(int age) {
		this.age = age;
	}
	
	Tier(){} // CF in line 1 verschwindet
}

class Zebra extends Tier { 
	Zebra(){
		this(2); 
	}
	
	Zebra (int alter){
		super(alter);
	}
}