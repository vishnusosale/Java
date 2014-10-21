package bank.transaction;

/*
 * This example is just to show polymorphism but not actual banking application 
 */
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===Savings Account===");
		new Transaction(new SavingsAcc(10000.00));
		System.out.println("===Loan Account===");
		new Transaction(new LoanAcc(20000.00));
	}

}
/*
 * the main disadvantage of this type of code is that we can create 
 * an account object which has to generalised and protected. Therefore,
 * we go for abstraction and interfaces
 * */
 