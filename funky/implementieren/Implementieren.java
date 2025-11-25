package funky.implementieren;

interface FuncInt{ // SAM = NUR mit einer(!) abstrakten M.
	public abstract void mini(); // WAS, nicht WIE
//	welche MethodenTypen gibt es noch in interfaces?
	default void defaultMethode() {}
	static void statischeMethode() {}
//	void zweiteAbstrakte();
}

public class Implementieren implements FuncInt {
	public void mini() {
		System.out.println("Ich bin die inmpl. M.");
	}

	public static void main(String[] args) {
		System.out.println("=== normale Implementierung ===");
		Implementieren i = new Implementieren();
		i.mini();
		System.out.println("=== PM ===");
		FuncInt pm = new Implementieren();
		pm.mini(); // PM: Kind gewinnt immer
		FuncInt zweite;
		zweite = new Implementieren();
		zweite.mini();
		System.out.println("=== Lambda-Ausdruck ===");
		FuncInt go;
		go = () -> System.out.println("Jetzt im Lambda-Ausdruck"); // Überschreiben der abstr. M. (Body gehört zur einzigen abstr, M.))
		go.mini();
		
	}

}
