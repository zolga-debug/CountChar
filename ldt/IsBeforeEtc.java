package ldt;

import java.time.LocalDate;

public class IsBeforeEtc {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, 1, 30);
		LocalDate test = LocalDate.of(2015, 1, 31);
		LocalDate upTo = start;
		for(int i=0;i<3;++i) {
			System.out.print(upTo +" before "+test+" : "+upTo.isBefore(test)+"\t");
			System.out.print(upTo +" equals "+test+" : "+upTo.equals(test)+"\t");
			System.out.println(upTo +" after "+test+" : "+upTo.isAfter(test)+"\t");
			upTo = upTo.plusDays(1);
		}
		System.out.println("Hallo".equals("hallo"));
		System.out.println(LocalDate.of(2015, 1, 30).isBefore(LocalDate.of(2015, 1, 31)));
	}

}
