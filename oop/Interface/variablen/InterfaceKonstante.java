package oop.Interface.variablen;

public class InterfaceKonstante {

}

interface Foo{
	int BAR = 50;
	void go();
}

class Zap implements Foo{
	public void go() {
		BAR = 27; // CF, da final
	}
}