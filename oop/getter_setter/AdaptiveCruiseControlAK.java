package oop.getter_setter;

public class AdaptiveCruiseControlAK {


public static void main(String[] args) {
	
	Automobil a2 = new Automobil();
	a2.setName("Otto");
	a2.status();
	a2.zielGeschwindigkeit(130);
	a2.status();
}

}
class Automobil{
int geschwindigkeit = 15;
String name;

void setName(String name) {
	this.name = name;
}

void anhalten() {
	System.out.println(name+" will anhalten!");
	while(bremsen()) {
		
	}
}

void zielGeschwindigkeit(int zielGeschwindigkeit) {
	while(getGeschwindigkeit() < zielGeschwindigkeit) {
		beschleunigen();
	}
	while(getGeschwindigkeit() > zielGeschwindigkeit) {
		bremsen();
	}	
}

void beschleunigen() {
	this.geschwindigkeit++;
	
}

int getGeschwindigkeit() {
	return this.geschwindigkeit;
}

void bremsen() {
	this.geschwindigkeit--;				
}

void status() {
	System.out.println(this.name+" fährt gerade "+this.geschwindigkeit+" Km/h");
}
}

