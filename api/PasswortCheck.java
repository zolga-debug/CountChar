package api;

public class PasswortCheck {

	public static void main(String[] args) {
		String password = "tzZ99zh2";  // Зміни цей пароль для тесту
		 
          Boolean istGueltig = Boolean.FALSE;
		//boolean istGueltig = false;

        if (password != null && password.length() >= 8) {
            int buschtaben = 0;
            int ziffern = 0;
            int klein = 0;
            int gross = 0;
            int sondern = 0;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isLetter(ch)) {
                	buschtaben++;
                    if (Character.isUpperCase(ch)) gross++;
                    else klein++;
                } else if (Character.isDigit(ch)) {
                	ziffern++;
                } else {
                	sondern++;
                }
          
            	//istGueltig = (buschtaben >= 2 && ziffern >= 2 && klein >= 1 && gross >= 1 && sondern >=1);
            	 if (buschtaben >= 2 && ziffern >= 2 && klein >= 1 && gross >= 1 && sondern >= 1) {
                
                 	
                 	istGueltig = Boolean.TRUE;
                 }
            }
       

        System.out.println("Password ist Gültig: " + istGueltig);
    }
}
}

