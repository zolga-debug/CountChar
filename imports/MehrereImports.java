package imports;
import static java.lang.Math.round;
import static java.lang.Math.PI; // The import java.lang.Math.PI is never used, wenn eigenes field definiert wird
import static javax.swing.JOptionPane.*;

public class MehrereImports {
 static final double PI=2.14; // field hat hörere Prio. als Import
	public static void main(String[] args) {
		System.out.println(round(2.6)); // 3
		System.out.println(PI); // 3.141592653589793 ohne eigenem field
		System.out.println(3*PI); // 9.42477796076938
		System.out.println(12700*PI); // 39898.22670059037
		System.out.println(CANCEL_OPTION);
		
	}

}
