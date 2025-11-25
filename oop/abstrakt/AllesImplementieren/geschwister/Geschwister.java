package oop.abstrakt.AllesImplementieren.geschwister;

public class Geschwister {
public static void main(String[] args) {
	Canine w = new Wolf();
	Canine h = new Hund();
	
	w.m();
	h.m();
}
}
class Tier{}
abstract class Canine extends Tier{abstract void m();}
class Hund extends Canine{void m(){System.out.println("Hund");}}
class Wolf extends Canine  {void m(){System.out.println("Wolf");}}