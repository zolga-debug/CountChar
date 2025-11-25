package api;

import java.util.Arrays;

public class StringBuilderBsp {

	public static void main(String[] args) {
		{
		StringBuilder sb1;
		String s;
		Auto a;
		
		new String();
		
		s= new String("Hallo");
		s= new String("Welt");
		System.out.println(s);
		
		sb1 = new StringBuilder("Hallo");
		sb1 = sb1.append(" Welt"); // wie bei String
		sb1.append("!"); // mutable
//	    @Override
//	    public StringBuilder append(String str) {
//	        super.append(str);
//	        return this; // kein new...
//	    }
//	    private void ensureCapacityInternal(int minimumCapacity) {
//	        // overflow-conscious code
//	        if (minimumCapacity - value.length > 0) {
//	            value = Arrays.copyOf(value,
//	                    newCapacity(minimumCapacity));
//	        }
		System.out.println(sb1);
		
		StringBuilder sb = new StringBuilder("Hallo");
		sb.append(" liebe Welt" );
		sb.append(" - ");
		sb.append("ich grüße Dich.");
		System.out.println(sb);
		
		System.out.println("Der Bindestrich befindet sich an der Pos.: "+sb.indexOf("-"));
		sb.delete(11, 100);
//        if (end > count)
//            end = count;
		
//		out from:
//		    public AbstractStringBuilder delete(int start, int end) {
//	        if (start < 0)
//	            throw new StringIndexOutOfBoundsException(start);
//	        if (end > count)
//	            end = count;
//	        if (start > end)
//	            throw new StringIndexOutOfBoundsException();
//	        int len = end - start;
//	        if (len > 0) {
//	            System.arraycopy(value, start+len, value, start, count-end);
//	            count -= len;
//	        }
//	        return this;
//	    }
		System.out.println(sb);
		}
	      /*
	       * Übung: Bitte löschen Sie aus dem Text "Hallo Welt - ich grüße Dich." 
	       * alles ab der Position des Bindestriches - ohne(!) diese Position zu kennen.
	       */
		{
			System.out.println("=== AK ===");
			StringBuilder sb = new StringBuilder("Hallo liebe Welt - ich grüße Dich.");
			
			sb.delete(sb.indexOf("-"), sb.length());
			System.out.println(sb);
		}
		{
			System.out.println("=== KK ===");
			StringBuilder sb = new StringBuilder("Hallo liebe Welt - ich grüße Dich.");
			int bindestrichPos = sb.indexOf("-");
			 
			if (bindestrichPos != -1) { // wenn nicht nicht-gefunden, dann löschen
			    sb.delete(bindestrichPos, sb.length());
			}
	 
			System.out.println(sb);
		}
		{
			System.out.println("=== DA ===");
			StringBuilder sb = new StringBuilder("Hallo liebe Welt - ich grüße Dich.");
			int sbi = sb.indexOf("-");
			sb.delete(sbi, 100); // statt 100 Länge ermitteln
			System.out.println(sb);
		}
		{
			System.out.println("=== CB ===");
			StringBuilder sb = new StringBuilder("Hallo liebe Welt - ich grüße Dich.");
			System.out.println(sb.delete(sb.indexOf("-"), sb.length()));
		}
	}

}
