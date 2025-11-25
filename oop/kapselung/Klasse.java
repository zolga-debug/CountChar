package oop.kapselung;

public class Klasse{ // mit default: nicht sichtbar aus anderen Packages
	private int zahl;
	String name; // default
	protected double umsatz;
	public long artikelNr;
}

class PackageVersuch{
	Klasse testMember;
}