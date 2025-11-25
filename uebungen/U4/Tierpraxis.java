package uebungen.U4;

import java.util.ArrayList;



class Tier {
 void untersuchen() {
 System.out.println("Allgemeine Untersuchung...");
 }
   }
 class Hund extends Tier {
	
		 void bellen() {
			    System.out.println("Wuff!");
			}
	}
 class Katze extends Tier{
	 void schnurren() {
		    System.out.println("Schnurr...");
		}

	   }
 class Papagei extends Tier {
	 void sprich() {
		    System.out.println("Hallo! Ich bin ein Papagei!");
		}
	 }
	 class Tierarzt {
		 void tierUntersuchen(Tier t) {
			 t.untersuchen();
			 if (t instanceof Hund) {
				 ((Hund)t).bellen();
			 }else{
				 if (t instanceof Katze) {
			 
				 ((Katze)t).schnurren();
				 }else{
					 if (t instanceof Papagei ) {
				 
					 ((Papagei)t).sprich();
					 } 
					 } 
			 
			 }	 
	 }
			 }
	 
	 
	 public class Tierpraxis {
		 public static void main(String[] args) {	
			 
			 Tierarzt praxis = new Tierarzt();
			 
			 ArrayList<Tier>tier = new ArrayList<>();
			 tier.add(new Papagei());
			 tier.add(new Hund());
			 tier.add(new Katze());
			for (Tier t : tier) {
				
				praxis.tierUntersuchen(t);;
			}
			 
	 
	 }
	 }
 
 

