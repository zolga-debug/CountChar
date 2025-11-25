package init;

public class StaticInstanz {

	{
		System.out.println("Instanz-Ini");
	}
	static {
		System.out.println("staticIni");
//		new StaticInstanz();
	}
	public static void main(String[] args) {
		new StaticInstanz();
	}

}
