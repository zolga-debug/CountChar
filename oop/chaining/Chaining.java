package oop.chaining;

public class Chaining {
	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1);
		Auto a2 = new Auto("Otto");
		System.out.println(a2);
		Auto a3 = new Auto('D');
		System.out.println(a3);
		Auto a4 = new Auto("Susi",'E');
		System.out.println(a4);
	}
}

class Auto {
	String name;
	char antriebsKonzept; // E = E-Auto, D = Diesel, B = Benzin

	public Auto() {
		this('U'); // ruft den K. auf, der einen Char nimmt
	}


	public Auto(String name) {
		this(name,'U'); // U = undef.
	}

	public Auto(char antriebsKonzept) {
		this("undefiniert",antriebsKonzept);
	}

	public Auto(String name, char antriebsKonzept) { // nur hier wird gearbeitet
		this.name = name;
		this.antriebsKonzept = antriebsKonzept;
	}

	public String toString() {
		return "Auto [name=" + name + ", antriebsKonzept=" + antriebsKonzept + "]";
	}
}