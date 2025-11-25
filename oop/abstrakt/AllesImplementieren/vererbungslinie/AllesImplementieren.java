package oop.abstrakt.AllesImplementieren.vererbungslinie;

public class AllesImplementieren {

}
abstract class Eltern{abstract void m1();}
abstract class Kind extends Eltern{abstract void m2();} 
//class Enkel extends Kind{ void m() {}}
// Übung: Bitte sorgen Sie durch Implementieren dafür, dass der CF verschwindet.
//class Enkel extends Kind{ void m1() {} void m2() {}} // CB
class Enkel extends Kind { // KK
    void m1() {
        System.out.println("m1 implementiert");
    }
 
    void m2() {
        System.out.println("m2 implementiert");
    }
}

