package verzweigung;

public class Mehrfach {

	public static void main(String[] args) {
		{
			int test = 3;
			
			switch (test) {
			case 1:
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case 2:
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}
		{
			byte test = 1;
			
			switch (test) {
			case 1:
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case 2:
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}
		{
			short test = 2;
			
			switch (test) {
			case 1:
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case 2:
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}
		{
//			long test = 2; // nur bis int
//			
//			switch (test) { // CF: Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
//			case 1:
//				System.out.println("Eins");
////				hier können viele Anweisunge stehen
//				break; // beendet Block
//			case 2:
//				System.out.println("Zwei");
//				break;
//			default:
//				System.out.println("alle anderen Zahlen");
//			}
		}
		{
			System.out.println("======== gemein ==============");
			char test = '2'; // char ist intern int => alle anderen Zahlen
			
			switch (test) {
			case 1:
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case 2:
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}
		{
			System.out.println("======== OK ==============");
			char test = '2'; // 
			
			switch (test) {
			case '1':
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case '2':
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}
		{
			System.out.println("======== String ==============");
			String test = "2"; // 
			
			switch (test) {
			case "1":
				System.out.println("Eins");
//				hier können viele Anweisunge stehen
				break; // beendet Block
			case "2":
				System.out.println("Zwei");
				break;
			default:
				System.out.println("alle anderen Zahlen");
			}
		}

		
	} // EndOfMain

}
