package oop.getter_setter;

public class AdaptiveCruiseControl {

	public static void main(String[] args) {
		Automobil otto = new Automobil();
		otto.zielGeschwindigkeit(130);
		otto.name = "Otto";
		otto.status();
	}

}
 class Automobil{
	 String name;
	 int geschwindigkeit; // defaulValue
	 int zielGeschwindigkeit;
	 
	 


 void setName(String name) {
	 this.name = name;
 }
 void beschleunigen() {
	geschwindigkeit++;
 }
 int getGeschwindigkeit() {
	 return this.geschwindigkeit;
 }
 void bremsen() {
		 if (geschwindigkeit>0)geschwindigkeit--;
 }
	 
 void zielGeschwindigkeit (int zielGeschwindigkeit) {
	 this.zielGeschwindigkeit = zielGeschwindigkeit;
	 
	while (geschwindigkeit > zielGeschwindigkeit) {
		bremsen();
		}
	while (geschwindigkeit < zielGeschwindigkeit) {
		beschleunigen();
		}
//	 while (geschwindigkeit != zielGeschwindigkeit) {
//			if (geschwindigkeit < zielGeschwindigkeit)
//				 beschleunigen();
//			else
//				bremsen();
// }
 }
	void status() {
		System.out.println(this.name +" fährt gerade "+ this.geschwindigkeit +" Km/h");	 
 }
	
 } 
 
 