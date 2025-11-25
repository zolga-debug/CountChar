package oop.abstrakt.AbstractFinal.ErsteKonkrete;

public class ErsteKonkrete {

}
abstract class Eltern{abstract void m();}
abstract class Kind extends Eltern{} // Pflicht zum Implementieren wird durchgereicht
class Enkel extends Kind{ void m() {}} // erste konkrete Kl. MUSS implementieren