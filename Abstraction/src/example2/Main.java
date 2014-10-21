package example2;

public class Main {
	
	public static void main(String[] args) {
		
		SubClass sub1 = new SubClass();
		sub1.disp();
		sub1.view();
		
		SuperClass sub2 = new SubClass(); // Up casting
		sub2.disp();
		sub2.view();
			
	}

}
