package multipleInheritance;

/*
 * We can achieve multiple inheritance in java by using interfaces
 */
public class Main {

	public static void main(String[] args) {
		Exec ex = new Exec();
		ex.display();
		ex.view();
		
		SuperInterface1 supI1 = ex;
		supI1.display();
		
		SuperInterface2 supI2 = ex;
		supI2.display();
		supI2.view();
	}
}
