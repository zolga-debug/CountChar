package verzweigung;

public class Durchfallen {

	public static void main(String[] args) {
		char zahl = 66;
		zahl = 0x32;
		switch (zahl) {
		default: 
			System.out.println("Die Else");
//			break;
		case '1':
			System.out.println("ne Eins");
			break;
		case 'A':
			System.out.println("Ein A");
		} // EndOfSwitch
		
		System.out.println("ENTE");
	} // EnDOfMain

}
