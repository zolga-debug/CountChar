package ldt;

import java.time.LocalDate;
import java.time.Month;

public class var_konst {

	public static void main(String[] args) {
		int tag,monat,jahr=1999;
		tag = 16;
		monat=6;
		jahr=1999; // Y2K
		
		LocalDate datum = LocalDate.of(jahr, monat, monat);
		System.out.println(datum);
		
		datum = LocalDate.of(2021,Month.JULY,13);
		System.out.println(datum); // 2021-07-13
		
	}

}
