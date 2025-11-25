package ldt;

import java.time.LocalDate;

public class With {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 3, 13);
		System.out.println(date);
		date = date.withDayOfMonth(5);
		System.out.println(date);
	}

}
