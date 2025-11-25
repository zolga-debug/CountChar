package init;

public class InitialisiererMitUeberladenenKonstruktoren {

	InitialisiererMitUeberladenenKonstruktoren (){
		System.out.println("im Konstruktor");
	}
	InitialisiererMitUeberladenenKonstruktoren (int i){
		System.out.println("im Konstruktor mit int");
	}
	{
		System.out.println("Instanz-Ini");
	}
	static {
		System.out.println("staticIni");
	}
	public static void main(String[] args) {
		System.out.println("noch kein Objekt");
		new InitialisiererMitUeberladenenKonstruktoren();
		new InitialisiererMitUeberladenenKonstruktoren(1);
	}


}
