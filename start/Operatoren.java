package start;

public class Operatoren {

	public static void main(String[] args) {
		{
			System.out.println("=== relationale Operatoren ===");
			System.out.println(5 == 5);
			System.out.println(5 != 5);
//		System.out.println(5 <> 5);
			System.out.println(5 > 5);
			System.out.println(5 < 5);
			System.out.println(5 >= 5);
			System.out.println(5 <= 5);

			int i = 5;
			System.out.println(i == 5);

			int j = 5;
			System.out.println(i == j);

			System.out.println("=== logische Operatoren ===");
			System.out.println("UND");
			System.out.println(false & false);
			System.out.println(false & true);
			System.out.println(true & false);
			System.out.println(true & true);

			System.out.println("ODER");
			System.out.println(false | false);
			System.out.println(false | true);
			System.out.println(true | false);
			System.out.println(true | true);

			System.out.println("XOR");
			System.out.println(false ^ false);
			System.out.println(false ^ true);
			System.out.println(true ^ false);
			System.out.println(true ^ true);

			System.out.println("NICHT");
			System.out.println(!false);

			boolean a = true;
			boolean b = a;

			System.out.println((a & !b) | (!a & b)); // XOR
			System.out.println((true & !true) | (!true & true));

			System.out.println("=== binäre Operatoren ===");
			System.out.println("Grundrechenarten: + - * /");
			int u = 1 + 2;

			System.out.println("=== unäre Operatoren ===");
			i = 0;
			System.out.println(i); // 0
			System.out.println(++i); // 1
			System.out.println(i++); // 1
			System.out.println(i); // 2

			int n;
			j = 3;
			n = ++j * 5 / j-- + --j;
			System.out.println("j: " + j + "     n: " + n);

			System.out.println("=== short circuit Operatoren ===");
			System.out.println("UND");
			int x = 0;
			System.out.println(false & /* & */ ++x < 1); // Dead code
			System.out.println("x ist = " + x); //

			x = 0;
			System.out.println("ODER");
			System.out.println(true || ++x < 1);
			System.out.println("x ist = " + x); //

			System.out.println("===================================");
			final int t = 10;
			int y = 5;

			if (t > 20 && y++ < 10) { // wg. var. kein dead Code wohl aber bei Konstanten
				System.out.println("Bedingung erfüllt");
			}
			System.out.println("y = " + y);

//		----------------

			System.out.println("============== Modulo =====================");
			System.out.println(7 % 3); // 1
			System.out.println(7 / 3); // 2

			int L = 7;
			int m = 3;

			System.out.println("Übung: 7 geteilt durch 3 ist 2 Rest 1");
			System.out.println(" ... hier kommen Text, Variablen und Formeln hin ...");
		}
		{
			System.out.println("============== DA =====================");
			int a = 7;
			int b = 3;
			int n = a / b;
			int m = a % b;

			System.out.println("Übung: " + a + " geteilt durch " + b + " ist " + n + " Rest " + m);
		}
		{
			System.out.println("============== ST =====================");
			int L = 7;
			int m = 3;
			System.out.println(L + " geteilt durch " + m + " ist " + (L / m) + " , Rest " + (L % m));
		}
		{
			System.out.println("============== AK =====================");
			int dividend, divisor, division, modulo;
			dividend = 7;
			divisor = 3;
			division = dividend / divisor;
			modulo = dividend % divisor;

			System.out.println(dividend + " geteilt durch " + divisor + " ergiebt: " + division + "Rest" + modulo);
		}
		{
			System.out.println("============== KK =====================");
			int L = 7;
			int m = 3;

			System.out.println(L + " geteilt durch " + m + " = " + L / m);
			System.out.println("Rest: " + L % m);
		}
		{
			System.out.println("============== IT =====================");
			int L = 7;
			int m = 3;
			int result;
			int rest;
			
			result = L/m;
			rest = L%m;
			
//			System.out.println("Übung: 7 geteilt durch 3 ist 2 Rest 1" );
			
			System.out.println(L + " geteilt durch " + m + " ist " + result + "\nRest: " + rest );
		}
	}

}
