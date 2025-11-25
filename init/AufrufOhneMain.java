package init;

public class AufrufOhneMain {
	public static void main(String[] args) {
		StatischOnly.wert=1;
	}
}

class StatischOnly {
	static {
		System.out.println("nix main()");
	}
	static int wert;
}
//nix main()		=> weil Klasse wg. Var. geladen werden muss.

1050