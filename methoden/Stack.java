package methoden;

public class Stack {

	public static void main(String[] args) {
		up1()   ;
		up2();
		up1();
	}
	static void up1() {
		System.out.println("in up1");
		up2();
	}
	static void up2() {
		System.out.println("in up2");
	}
}
/* LiFo
6
12
7
8