package oop.Interface.rollen.abstrakte;

public class Abstrakte {

}

class Fahren{}
class Auto extends Fahren{} // Auto ist logisch ein Fahren (is-a - Bez.), aber kommt so in unserer Lebenswirklichkeit nicht vor. 
class Ballon extends Fahren{} // Ballon ist  logisch ein Fahren (is-a - Bez.), aber kommt so in unserer Lebenswirklichkeit nicht vor. 

class Cabrio extends Auto{}  // Ein Cabrio ist ein Auto - hat eine is-a - Bez.


class Hund{}
class Fahrrad extends Hund {} // logisch ist ein Fahrrad ein Hund, kommt aber so in unserer Lebenswirklichkeit nicht vor. 