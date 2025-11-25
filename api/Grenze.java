package api;

public class Grenze {

	public static void main(String[] args) {
		StringBuilder sb6 = new StringBuilder(Integer.MAX_VALUE / 2);
		System.out.println(sb6.capacity()); // 1.073.741.823
//		StringBuilder sb7 = new StringBuilder(Integer.MAX_VALUE/4*3); // OutOfMemoryError: Java heap space
		for (int i=1073741823;;i++) new StringBuilder(Integer.MAX_VALUE / 2+i); // OutOfMemoryError: Requested array size exceeds VM limit
//		for (;;) {
//			sb6.append("5"); // append schützt vor RTE
//			System.out.println(sb6.capacity());
//		}
	}

}
