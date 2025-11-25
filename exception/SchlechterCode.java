package exception;

public class SchlechterCode {

	public static void main(String[] args) {
		String s="Hallo";
		
//		Übung: Bitte sorgen Sie dafür, das das PRG korrekt läuft, ohne die for(;;) vorbildlich zu programmieren.
		
			try {
				for (int i=0;     ;i++) {
					System.out.println(s.charAt(i));
				
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("Es ist ein Fehler aufgetreten: "+e.getClass().getSimpleName());
		
		}
		System.out.println("Fertig.");
		{
			
		}System.out.println("AK");
		
		for(int i = 0;;i++) {
			try {
				System.out.println(s.charAt(i));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("MUAHAHAHAHAHA");
				break;
			}
		}
		System.out.println("Fertig.");
		
		{
			
		}System.out.println("DA");
		try {
			for (int i=0;     ;i++) {
				System.out.println(s.charAt(i));
			}
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println(e.getClass().getSimpleName());
			}
			System.out.println("Fertig.");
		}
	}

	


