package schleife;

public class Schachtelung {

	public static void main(String[] args) {
		for(int i=0;i<2;++i) { // outer
			for (int j=0; j<3;j++) { // inner
				System.out.println("i: "+i+"\tj: "+j);
			}
		}
		
//		Übung: Struktogramm dazu erstellen
		
		System.out.println();
		
	    for (int i = 0; i < 1 ; ++i) {
	        for (int j = 0; j < 2; j++) {
	          if (j == 1) {
	            continue; 
	          }
	          System.out.println("i: " + i + "\tj: " + j); 
	        }
	  	}
	  	  
		
	}

}
