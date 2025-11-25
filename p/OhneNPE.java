package p;

import java.io.File;

public class OhneNPE {

	public static void main(String[] args) {
		File f = new File("C:\\Windows\\System32");
		dir(f);
	}
	static void dir(File dir) { // 
	
		File [] fa = dir.listFiles(); 
		if (fa != null) { 
		
		
		for(File e : fa) {
			if(e.isDirectory()) {
				dir(e);
			
			
			}else { 
				System.out.println("File: " + e);
			}
		}
			
			}
		}
		
		}
	
	


