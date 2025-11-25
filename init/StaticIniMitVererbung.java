package init;
class Eltern{
	static {
		System.out.println("im static I. der Eltern");
	}
}
class Kind extends Eltern{
	static String name;
	static {
		System.out.println("im static I. des Kindes");
	}
}
public class StaticIniMitVererbung {

	public static void main(String[] args) {
		System.out.println("Vor Laden der Klasse");
		System.out.println(Kind.name);
	}

}
