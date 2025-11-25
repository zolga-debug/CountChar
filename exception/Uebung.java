package exception;

public class Uebung {

	public static void main(String[] args) {
	String s = "";
	try {
		s+="t";
	} catch (Exception e) {
		s+="c";
	}finally {
	s+="f";
	}
	s+="a";
	System.err.print(s);
	}
	}


