package ldt;

import java.time.LocalDate;

public class Chaining {

	public static void main(String[] args) {
		System.out.println("Hallo".concat(" ").concat("Welt").substring(6));
		//@formatter:off
		System.out.println("Hallo"
				.concat(" ")
				.concat("Welt")
				.substring(6));
		
		LocalDate date = LocalDate.of(2020, 3, 13);
		date = date
				.withDayOfMonth(5)
				.minusMonths(1)
				.minusYears(70)
				;
		//@formatter:on
		System.out.println(date); // 1950-02-05
		
	}

}
