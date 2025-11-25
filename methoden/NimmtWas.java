package methoden;

public class NimmtWas {
	
	
	
	public static void main(String[] args) {
		ichNehmeEinenString(null);
		ichNehmeEinenString("Hallo");
		String einString = "Welt";
		ichNehmeEinenString(einString);
		ichNehmeEinenString(1);
		String var = 1;
		ichNehmeEinenString("1");
	} // EndOfMain
	
	static void ichNehmeEinenString( String s) {
		System.out.println(s);
	}
	
} // EndOfClass
