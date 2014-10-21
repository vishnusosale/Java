package multipleInheritance;

public class Exec implements SuperInterface1, SuperInterface2{
	
	public void view() {
		System.out.println("View() methond");
	}
	
	public void display() {
		System.out.println("display() method");		
	}
}
