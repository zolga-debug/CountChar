package uebungen;

import java.util.Random;

public class PasswortGenGT {

	public static void main(String[] args) {
		Random rand = new Random(); 

		String passwort = "";

		int[] wiederholungen = new int[10];

		for (int dummy : wiederholungen) {

			int zahl = rand.nextInt(94) + 33;

			char zeichen = (char) zahl;

			passwort += zeichen;

		}

		final String ANSI_BOLD = "\u001B[1m";

		final String ANSI_RED = "\u001B[31m";

		final String ANSI_BLUE = "\u001B[34m";

		final String ANSI_RESET = "\u001B[0m";

		System.out.println(ANSI_BOLD + ANSI_BLUE + "Random Code: " + ANSI_BOLD + ANSI_RED + passwort + ANSI_RESET);

	}

}
