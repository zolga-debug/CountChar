package oop;
interface InterfaceMitFinalSB{
	StringBuilder ab = new StringBuilder("Hallo");
}
public class Irrtum {
	
public static void main(String[] args) {
	System.out.println(InterfaceMitFinalSB.ab);
	
	InterfaceMitFinalSB.ab.append("Welt");
	System.out.println(InterfaceMitFinalSB.ab);
}
}
class JetztMitImplementierung implements InterfaceMitFinalSB{
	void m() {
		System.out.println(ab);
	}
}