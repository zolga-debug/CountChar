package exception;

public class AufgabeMitMethode {
	static String s="M";
//	/*static*/ String s="M";
	public static void main(String[] args) {
		AufgabeMitMethode amm = new AufgabeMitMethode();
		int[] ia = {};
		int i=1;
		s+=i;
		try {
			s+=true;
			amm.m(ia);
			s="T";
		} catch (/*NullPointer*/Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			s="H";
		}
		System.out.println(s);
	}
	void m(int[] ia) {
		ia[0]++;
	}
}
