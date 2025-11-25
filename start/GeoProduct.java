package start;
	import java.math.BigInteger;
	public class GeoProduct {
	
	public static void main(String[] args) {
		
	
		        int exponent = 2016;

		        // 2^2016 с помощью BigInteger
		        BigInteger result = BigInteger.TWO.pow(exponent);

		        // Результат (может быть очень длинным!)
		        System.out.println("2^2016 = " + result);
		    }
		}


