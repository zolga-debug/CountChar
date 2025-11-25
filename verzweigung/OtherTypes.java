package verzweigung;

public class OtherTypes {

	public static void main(String[] args) {
		int i=1;
		float y = 1.F;
		double d = 1.;
		switch(i) {};
		switch(y) {}; // CF: Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
		switch(d) {}; // CF
		
//		erlaubt: byte, short, int, char, String (Exam)
	}

}
