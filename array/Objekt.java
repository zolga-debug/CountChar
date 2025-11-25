package array;

public class Objekt /*extends Object*/ {

	public static void main(String[] args) {
		Object [] oa;
		oa = new Object[3];
		oa[0] = 1; // alles ist ein Object? => Nein: int wird durch AutoBoxing zu Integer
		oa[1] = new Auto();
		oa[2] = "Hallo";
		for ( Object element : oa) System.out.println(element);
//		1 => UnBoxing zu int
//		array.Auto@15db9742
//		Hallo

	}

}
