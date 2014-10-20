package casting;

public class Start {
	
	void exec(SuperClass obj){
		
		System.out.println("====Casting from Start class====");
		// Up casting 
		obj.disp();
		System.out.println(obj.i);
		
		// Down casting
		SubClass sub2 = (SubClass) obj;
		sub2.view();
		System.out.println(sub2.k);
	}

}
