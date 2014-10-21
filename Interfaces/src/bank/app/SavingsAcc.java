package bank.app;

public class SavingsAcc implements Account{
	
	double amtBal;
	SavingsAcc(double initAmt){
		amtBal = initAmt;
	}
	public void deposit(double amt){
		System.out.println("Depositing : " + amt);
		amtBal = amtBal + amt;
	}
	public void withdrawal(double amt){
		System.out.println("Withdrawing : " + amt);
		amtBal = amtBal - amt;
	}
	public void viewBal(){
		System.out.println("Balance is : " + amtBal);
	}
}
