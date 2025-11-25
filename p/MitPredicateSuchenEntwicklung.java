package p;

import java.util.function.Predicate;

public class MitPredicateSuchenEntwicklung {

	public static void main(String[] args) {
		String zuDurchsuchenderString = "Hallo liebe Welt";
		zuDurchsuchenderString = "liebe Welt";
		/*final*/ String suchString="Hallo";
		Predicate <String> p = s -> s.contains(suchString);
		System.out.println(p.test(zuDurchsuchenderString)); // true
		
		System.out.println("====================================");
		final String nochEinSuchString="Weltbürger"; // Reduziert Flüchtigkeitsfehler
		/*final String*/ nochEinSuchString="Hallo"; // 
		eineMethode("Bist Du ein Weltbürger?", s -> s.contains(nochEinSuchString)); // CF: Local variable nochEinSuchString defined in an enclosing scope must be final or effectively final
	}
	static void eineMethode(String zuDurchsuchenderString,Predicate<String> p) {
		System.out.println((p.test(zuDurchsuchenderString)?"": "nicht ")+ "enthalten."); // true
	}
}
