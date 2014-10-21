package example1;

/*
 * Abstraction example: hiding the implementation of the ogject from its usage
 */
public class Main {
	
public static void main(String[] args) {
		
		System.out.println("===Savings Account===");
		new Transaction(new SavingsAcc(10000.00));
		System.out.println("===Loan Account===");
		new Transaction(new LoanAcc(20000.00));
		
	}

}
