package count;

public class CountChar {

	public static void main(String[] args) {
		
		 if (args.length != 2) {
	            System.out.println("Bitte geben Sie einen Satz und ein Zeichen an.");
	            return;
	        }

	        String satz = args[0];
	        char zeichen = args[1].charAt(0);
	        int count = 0;

	       
	        for (char c : satz.toCharArray()) {
	            if (Character.toLowerCase(c) == Character.toLowerCase(zeichen)) {
	                count++;
	            }
	        }

	        System.out.println("Der Buchstabe '" + zeichen + "' kommt " + count + " Mal vor.");
	    }
	}
