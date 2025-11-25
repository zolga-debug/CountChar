package init;

public class InstanzInitBlock {

	{
		System.out.println("Im Init-Block");
	}
	
	public static void main(String[] args) {
		new InstanzInitBlock();
		System.out.println("Fertig");
	}

}
