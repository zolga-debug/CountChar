package oop.static_mambers;

public class StaticMambers {
	static String m="static field in StaticMambers";

	public static void main(String[] args) {
		m();
		WeitereStaticMembers.m();
		System.out.println(/*StaticMambers.*/m);
		System.out.println(WeitereStaticMembers.m);
	}

	static void m() {
		System.out.println("Ich bin eine statische M. i.d. Klasse StaticMambers.");
	}
}

class WeitereStaticMembers{
	static void m() {
		System.out.println("Jetzt in WeitereStaticMembers");
	}
	static String m="static field in WeitereStaticMembers";
}