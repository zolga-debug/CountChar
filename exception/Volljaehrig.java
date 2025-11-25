package exception;

import java.util.Scanner;

public class Volljaehrig {

	public static void main(String[] args) {
//		Übung:
//		Bitte geben Sie den Namen einer Person und dessen Alter über 
//		die Tastatur ein (kann über 2 Eingabe-Anweisungen geschehen).
//		Mögl. Erweiterung: Eingabe in einer Anweisung (z.B Karl, 17)
//		Abhängig vom Alter soll der Name und das Alter ausgegeben werden
//		(z.B Hallo Susi, Du bist bereits volljährig.)
//		Falls die Person jünger als 18 Jahre ist, soll eine NichtVolljaehrigException 
//		geworfen werden.
		
		        Scanner sc = new Scanner(System.in);

		        try {
		            // Ввод имени
		            System.out.print("Bitte geben Sie den Namen ein: ");
		            String name = sc.nextLine();

		            // Ввод возраста
		            System.out.print("Bitte geben Sie das Alter ein: ");
		            int alter = sc.nextInt();

		            // Проверка возраста
		            if (alter < 18) {
		                // выбрасываем исключение, если < 18
		                throw new NichtVolljaehrigException(
		                        "Hallo " + name + ", du bist noch nicht volljährig!"
		                );
		            } else {
		                System.out.println("Hallo " + name + ", du bist bereits volljährig.");
		            }

		        } catch (NichtVolljaehrigException e) {
		            // Обрабатываем наше исключение
		            System.out.println("FEHLER: " + e.getMessage());
		        }
		    }
		}

//создаём собственное исключение
     class NichtVolljaehrigException extends Exception {
		    public NichtVolljaehrigException(String message) {
		        super(message);
		    }
		
		
		
		
	  }	
	






