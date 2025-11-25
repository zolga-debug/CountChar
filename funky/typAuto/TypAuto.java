package funky.typAuto;

import java.util.function.Predicate;

public class TypAuto {

	public static void main(String[] args) {
		Auto[] autos = {new Auto("Uschi"),new Auto("Hugo"),new Auto("Karl"),new Auto("Martina")};
//		Übung: Bitte geben Sie i.d. Console alle Autos mit deren Namen aus, die max. 4 Zeichen lang sind.
		
		Predicate<Auto> kurze = (auto)-> auto.name.length()<=4;
			
		
			for (Auto element : autos) {
				if (kurze.test(element))
				System.out.print(element.name+" ");
		}
	}

}
class Auto{
	String name;
//	Übung: Bitte schicken Sie mir im Chat einen Konstruktor, der einen Namen nimmt.
	Auto(String name){
		this.name = name;
	}
}