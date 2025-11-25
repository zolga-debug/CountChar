package exception;
class OutOfCoffeeException extends RuntimeException{}

public class EigeneExceptions {

	public static void main(String[] args) {
		throw new OutOfCoffeeException();
	}

}
