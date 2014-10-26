package example2;

/*
 * Inheritance example
 */
public class Main {

	public static void main(String[] args) {
		
		new A(18);
		new B();
		new C();
		
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

