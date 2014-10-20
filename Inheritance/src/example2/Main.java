package example2;

public class Main {

	public static void main(String[] args) {
		
		A a1 = new A(18);
		B b1 = new B();
		C c1 = new C();

	}

}



/*

	Order of exec will be from super class through sub class which is defined

*/
/*
 *  control flow : 
 *  new()--->C--->B--->A(arg)
 *  
 *  execution:
 *  
 *  A(arg)--->B--->C--->main
 */

