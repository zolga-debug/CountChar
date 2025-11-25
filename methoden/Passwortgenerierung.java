package methoden;

import java.util.Random;

public class Passwortgenerierung {

	public static void main(String[] args) {
		
		String passwort = generierePasswort();//В методе main() вызываем функцию generierePasswort(), которая возвращает готовый пароль.
        System.out.println("Generiertes Passwort: " + passwort);//Результат выводится на экран.
   
	    String passWord = generatePW();
	    System.out.println("Das Passwort lautet: " + passWord);
	 }
    // Hauptfunktion zur Passwortgenerierung
    public static String generierePasswort() {
    //    StringBuilder passwort = new StringBuilder();// пустая строка для пароля
    	String passwort = " ";
        while (passwort.length() < 10) {
            int zufallsZahl = rand(127);  // генерируется случ число от 0 до 127
            if (istGueltigesZeichen(zufallsZahl)) {// проверяем входит ли число в доп диапазон
                char zeichen = charVonZahl(zufallsZahl);  // если да, то преобразовываем число в символ
             //     passwort.append(zeichen);// добавляем в пароль 
                passwort = passwort + zeichen;// cандартная конкатенация
            }
        }
        // return passwort.toString();
           return passwort;
    }
/*• Создаём StringBuilder — удобный способ накапливать строку.
 • Запускаем цикл, пока длина пароля меньше 10 символов.
 • Внутри цикла:
 • Генерируем случайное число от 0 до 127 с помощью rand(127).
 • Проверяем, является ли это число допустимым символом (код от 33 до 126).
 • Преобразуем число в символ с помощью charVonZahl() и добавляем его в пароль.
*/
    // Funktion: Liefert eine Zufallszahl zwischen 0 und max (inkl.)
    public static int rand(int max) {//Используется класс Random для генерации чисел
        Random random = new Random();
        return random.nextInt(max + 1);  // возвращает число в диапазоне [0, max], т.е. от 0 до 127.
    }
  
  // Funktion: Wandelt eine Zahl in ein ASCII-Zeichen um
   
    public static char charVonZahl(int zahl) {//Преобразуем целое число в символ по таблице ASCII
        return (char) zahl;
    }
   
    // Funktion: Prüft, ob die Zahl einem druckbaren ASCII-Zeichen entspricht
    public static boolean istGueltigesZeichen(int zahl) {//Проверка, входит ли код в диапазон видимых символов ASCII.
        return zahl >= 33 && zahl <= 126;
    
		//System.out.println("=============="));
        
 
	public static String generatePW() {
		String pw = "";
		for (int i = 0; i < 10; i++) {
			int ch = rand(127);
			pw += (char) ch;
			System.out.println("char "+ (i+1) + ": " + ch + "\t" + (char) ch);
		}
		return pw;
	}
	
	private static int rand (int i) {
		return new Random().nextInt(i+1);
 
	}
     //System.out.println("=============="));
	
	int passwordLength = 10;
	String password = "";
	
	for (int i = 0 ; i < passwordLength ; i++) {
		int intForChar = new Random().nextInt(94) + 33;
		char charForPassword = (char)intForChar;
		password += charForPassword;
	}
	
	System.out.println("Generiertes Passwort: " + password);   
  
        
    }
}
