package api;

public class PasswortChecker {
    public static boolean checkPassword(char[] passwordArray) {
        String password = new String(passwordArray);

        if (password.length() < 8) return false;

        int letterCount = 0;
        int digitCount = 0;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
                if (Character.isUpperCase(ch)) hasUpper = true;
                if (Character.isLowerCase(ch)) hasLower = true;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                hasSpecial = true;
            }
        }

        return letterCount >= 2 && digitCount >= 2 && hasUpper && hasLower && hasSpecial;
    }

    public static void main(String[] args) {
        char[] pw = "Ab12@xyz".toCharArray();
        System.out.println(checkPassword(pw)); // → true
    }
}
