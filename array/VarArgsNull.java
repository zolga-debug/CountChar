package array;

public class VarArgsNull {

	public static void main(String[] args) {
		varArgs(null);
	}

	static void varArgs(int... i) {
		if (i!=null) for (int element : i) System.out.println(element); else System.out.println("nix");
		for (int j=0;j<i.length;j++) System.out.println(i[j]);
	}
	
}
