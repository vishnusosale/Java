package beans;

/*
 * Java beans example : private instance variables, public constructors and getter and setter methods
 * Getters(accessors) provide read access and setters(mutators) provide write access.
 * 
 * best used to access databases
 */
public class Main {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(22, "ABC", 66000.66);
		
		System.out.println("Employee ID: " + e1.getId() + "\n" + "Employee name: " + e1.getName() + "\n" + "Employee Salary: " + e1.getSalary());
		e1.setSalary(89000.00);
		System.out.println("Employee ID: " + e1.getId() + "\n" + "Employee name: " + e1.getName() + "\n" + "New Employee Salary: " + e1.getSalary());

	}
	
	

}
