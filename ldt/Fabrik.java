package ldt;

import java.time.LocalDate;

public class Fabrik {

	public static void main(String[] args) {
//		Auto a = new Auto();
		Auto a = Auto.autoMachen();
		System.out.println(a);
		
		LocalDate heute;
		heute = LocalDate.now();
		System.out.println(heute.getClass().getSimpleName());
		
		LocalDate fehler = new LocalDate();
	}

}

class Auto {
	private Auto() {
	}

	static Auto autoMachen() { // Fabrik-M.
		return new Auto();
	}
}
//private LocalDate(int year, int month, int dayOfMonth) {
//    this.year = year;
//    this.month = (short) month;
//    this.day = (short) dayOfMonth;
//}