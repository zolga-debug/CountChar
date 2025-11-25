package oop.Interface.Mehrfach_Vererbung.Super;

public class MehrfachVererbungInterfaceBspUeberschreibenSuper {

}
interface Walk{
//	public default int getSpeed() {
//		return 5;
//	}
}

interface Run{
	public default int getSpeed() {
		return 10;
	}
	
}

class Cat implements Walk, Run{ // CF: Mehrfachvererbung: Duplicate default methods named getSpeed with the parameters () and () are inherited from the types Run and Walk
//	public  int getSpeed() {
//		return Walk.super.getSpeed(); // gezielt eine Eltern-Interface-M. verwenden
//	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		System.out.println(c1.getSpeed());
	}
	
}