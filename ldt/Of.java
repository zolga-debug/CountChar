package ldt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Of {

	public static void main(String[] args) {
		LocalDate rechnungsDatum = LocalDate.of(2021, 1, 18); // ISO: 2021-1-18 =>  Datumsformat YYYY-MM-DD
		System.out.println(rechnungsDatum); // toString(): 2021-01-18
		Object o = rechnungsDatum; // PM
		System.out.println(o); // 2021-01-18
		
		LocalTime zeit = LocalTime.now();
		System.out.println(zeit); // 11:33:59.866 inkl. nano-Sec.
		
		LocalDateTime jetzt = LocalDateTime.of(rechnungsDatum,zeit);
		System.out.println(jetzt); // 2021-01-18T11:36:18.791
	}

}
