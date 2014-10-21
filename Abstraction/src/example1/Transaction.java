package example1;

public class Transaction {
	
Transaction(Account a) {
		
		a.viewBal();
		a.deposit(10000.00);
		a.viewBal();
		a.withdrawal(8000.00);
		a.viewBal();
		a.deposit(2000.00);
		a.viewBal();
	}

}
