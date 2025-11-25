package uebungen.U6;

public class A5 {

		int count;
		
		public static A5 displayMsg() {
			A5 app = new A5();
			app.count = 9;
		    return app;
			
			
		}
		public static void main(String[] args) {
			
	    A5 app = A5.displayMsg();
	
		
		
		System.out.println("Welcome"+ app.count);
}
}