package init;

public class StaticInstanzKonstruktor {
	StaticInstanzKonstruktor (){
		System.out.println("im Konstruktor");
	}
	{
		System.out.println("Instanz-Ini");
	}
	static {
		System.out.println("staticIni");
	}
	public static void main(String[] args) {
		System.out.println("noch kein Objekt");
		new StaticInstanzKonstruktor();
	}

}
