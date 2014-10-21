package bank.transaction;

public class LoanAcc extends Account{
	
	double amtBal = 0.0;
	LoanAcc(double initAmt){
		amtBal = initAmt;
	}
	void deposit(double amt){
		System.out.println("Depositing : " + amt);
		amtBal = amtBal - amt;
	}
	void withdrawal(double amt){
		System.out.println("Withdrawing : " + amt);
		amtBal = amtBal + amt;
	}
	void viewBal(){
		System.out.println("Balance is : " + amtBal);
	}
}
