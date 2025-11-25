package oop.pm.ueberschreiben.BeweisFuerLateBinding.Eingabe;

import java.util.Random;
import java.util.Scanner;

//@formatter:off
class Auto {public String toString() {return "Auto";}}
class Cabrio extends Auto {public String toString() {return "Cabrio";}}
//@formatter:on
public class BeweisFuerLateBindingEingabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Auto auto = new Auto();
		Cabrio cabrio = new Cabrio();
		Auto ac = auto; // PM vorbereiten
		
		for(int i=0; i<3;i++) {
			
				System.out.println("Bitte geben Sie \"A\" für Auto und \"C\" für Cabrio ein.");
				String eingabe = scanner.nextLine().toLowerCase();
	 
				if(eingabe.equals("c")) {
					ac = cabrio;
				}else {
					ac = auto;
				}
				System.out.println("Sie haben die Option: " + ac +" gewählt.\n");
			}
		scanner.close();
		}	
	}

