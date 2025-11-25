package oop.statusST;

public class StatusST {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.geschwindigkeit = 50;
		a1.status();
	}
}
 
class Auto {
	int geschwindigkeit = 0;
 
	boolean rekuperation;
	int rekuperationInProzent = 80;
	
	void beschleunigen() {
 
		geschwindigkeit += 1;
	}
	void bremsen() {
		geschwindigkeit --;
	}
	void status() {
		System.out.println("Ich fahre gerade " + geschwindigkeit + "km/H");
	}
 
	String statusDA (){
		return "Ich fahre gerade " + geschwindigkeit + " km/h";
	}
	
}
 