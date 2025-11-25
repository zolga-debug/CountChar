package api;

public class integer { // Wrapper

	public static void main(String[] args) {
		int i = 1; // Primitive
		Integer j = 1; // Object
		
//	    private final int value;
//
//	    public Integer(int value) {
//	        this.value = value;
//	    }
		
		
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(0x7fffffff); // 2147483647
		
		
		Integer k = new Integer(2);
		k = k+5; // unboxing, addieren, autoboxing
		System.out.println(k);
		
		i = 7;
		System.out.println(i == k); 
		
		i = Integer.parseInt("100");
		i = i*10;
		System.out.println(i);
		
		Integer i1 = 5;
		Integer i2 = new Integer(4);
		Integer i3 = new Integer("4");
		Integer i4 = Integer.valueOf(7); // boxing
		Integer i5 = Integer.valueOf("7");
		Integer i4a = Integer.valueOf(i1); // unboxing
		
		int i6 = i2; // unboxing
		int i7 = i3.intValue();
		
//	    public int intValue() {
//	        return value;
//	    }
	}

}
