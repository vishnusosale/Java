package bank.app;

public class CreateAcc {
	
	Account getAcc(char option){
		
		Account acc = null;
		if(option == 's'){
			acc = new SavingsAcc(10000.00);
		}
		else if(option == 'l'){
			acc = new LoanAcc(20000.00);
		}
		return acc;
	}
}
