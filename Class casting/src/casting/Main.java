package casting;

public class Main {
	
	public static void main(String[] args) {
		
		
		Start s = new Start();
		s.exec(new SubClass());
		
		System.out.println("====Casting from Main class====");
		SuperClass sup1 = new SubClass(); // Up casting 
		sup1.disp();
		System.out.println(sup1.i);
		
		
		SubClass sub1 = (SubClass) sup1; // Down casting
		sub1.disp();
		sub1.view();
		System.out.println(sub1.i);
		System.out.println(sub1.k);
	}

}
