package api;

public class Equal {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hallo");
		StringBuilder sb2 = new StringBuilder("Hallo");
		System.out.println(sb1.equals(sb2));
//	    public boolean equals(Object obj) { // von Object geerbt
//	        return (this == obj);
//	    }
		
		String s1 = new String("Hallo");
		String s2 = new String("Hallo");
		System.out.println(s1.equals(s2));
//	    public boolean equals(Object anObject) { // Überschrieben in String
//	        if (this == anObject) {
//	            return true;
//	        }
//	        if (anObject instanceof String) {
//	            String anotherString = (String)anObject;
//	            int n = value.length;
//	            if (n == anotherString.value.length) {
//	                char v1[] = value;
//	                char v2[] = anotherString.value;
//	                int i = 0;
//	                while (n-- != 0) {
//	                    if (v1[i] != v2[i])
//	                        return false;
//	                    i++;
//	                }
//	                return true;
//	            }
//	        }
//	        return false;
//	    }
		System.out.println(sb1.toString().equals(sb2.toString()));  // → true (ALT 26)
		
	}

}
