package oop.pm.zuweisung;

public class ZuweisungDownCast {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		Cabrio c1 = new Cabrio();
		c1.dachOffen=true;
		Auto a2 = /*(Auto)*/ new Cabrio(); // PM, upCast ist implizit
//		a2.dachOffen=false; // CF: Eltern kennen ihre Kinder nicht

		Auto a3 = new Object(); // CF, da Kind-Ref. auf Eltern-Obj. "zeigt" (Java: referenziert)
		Cabrio c2 = new Auto(); // CF dito
		
		Cabrio x;
//		x = a2; // CF: Type mismatch: cannot convert from Auto to Cabrio
		
//		int i = 1L; // line 1
//		Übung: Bitte lösen Sie das Probl. aus line 1
		int i = (int) 1L; 
		long j = /*(long)*/ i; // UpCast ist immer implizit
		int z;
//		j=z; // CF: nicht initialisiert
//		Auto a = x; // CF: nicht initialisiert
		Auto a4 = /*(Auto)*/ c1; // UpCast ist immer implizit
//		x=a2; // CF, da Compiler uns beschützt, denn a2 ist vom Typ Eltern
		x = (Cabrio) a2; // DownCast
		x.dachOffen=true;
	}	
}
class Auto{}
class Cabrio extends Auto{boolean dachOffen;}