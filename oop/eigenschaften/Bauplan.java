package oop.eigenschaften;

public class Bauplan {
	String ichBinEineEigenschaft;
	void ichBinEineFaehigkeit() {}
}

class Auto /*extends Object*/ {}
class Golf extends Auto{}
class GolfLuxusAusstattung extends Golf{}
class Dreier extends Auto{}
class M3 extends Dreier{}