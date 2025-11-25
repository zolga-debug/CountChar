package oop.Interface.Mehrfach_Vererbung;

public class MehrfachVererbungInterfaceBspUeberschreiben {
}
interface Walk{
	public default int getSpeed() {
		return 5;
	}
}

interface Run{
	public default int getSpeed() {
		return 10;
	}
	
}

class Cat implements Walk, Run{ // CF: Mehrfachvererbung: Duplicate default methods named getSpeed with the parameters () and () are inherited from the types Run and Walk
	public  int getSpeed() {
		return 15;
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		System.out.println(c1.getSpeed());
	}
	
}
