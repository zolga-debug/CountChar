package oop.Interface.Mehrfach_Vererbung;

public class MehrfachVererbungInterfaces {

}
interface Mutter{
	void reparieren();
}

interface Vater{
	void kochen();
}

class Kind implements Vater, Mutter{
	public void kochen() {}
	public void reparieren() {}
}