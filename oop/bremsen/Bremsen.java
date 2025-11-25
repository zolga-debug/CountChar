package oop.bremsen;



public class Bremsen {

	public static void main(String[] args) {
		Auto a1 = new Auto ();
		Auto a2 = new Auto();
		a1.setName("Susi");
		
		a2.setName("Otto");
        
		for (int i = 0; i < 10; i++) {
			a1.beschleunigung();
}
		a1.status();
		
		for (int i = 10; i < 0; i--) {
			a2.bremsen();
}	
		  a2.status();
	}
}
		
 class Auto {
	int speed = 0;
    String name;

void setName (String name) {
	this.name = name;
}
void beschleunigung() {
	speed +=1;
}
void bremsen() {
	speed --;
}
void status() {
	System.out.println( name + " fähtr gerade " +  speed + " km/h");
}
}

