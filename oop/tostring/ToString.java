package oop.tostring;

public class ToString {
	String name = "Susi";
	int alter = 43;
	
	void status() {// использовали ранее
		System.out.println("Ich heisse "+ name + " und bin "+alter+" Jahre alt.");
	}
	
	public String toString() {
//		return "Ich heisse "+ name + " und bin "+alter+" Jahre alt.";
		return "BlaBla";
	}
}

class ToStringDemo{
	public static void main(String[] args) {
		ToString ts = new ToString();
		System.out.println(ts);//выдаст Вlabla
	}
}
