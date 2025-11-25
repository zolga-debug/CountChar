package funky.ist_gerade_predi;

import java.util.function.Predicate;

public class IstGeradePredi {

	public static void main(String[] args) {
		System.out.println("=== mit funk. Interf. ===");
		IsGerade go = (zahl) -> zahl % 2 == 0; // Ak + CB
		System.out.println(go.test(12));
		System.out.println("=== mit Predicate ===");
		Predicate<Integer> predi = (zahl) -> zahl % 2 == 0;
		System.out.println(predi.test(12));
		Predicate<Integer> a;
	}

}

@FunctionalInterface
interface IsGerade {
	boolean test(int zahl);
}