public class TestBalance {

	public static void main(String[] args) {

		int balance = 10000, withd_amt = 2000, min_bal = 1000, count = 1;

		while (balance > min_bal) {

			System.out.println("current balance is " + balance + " transaction number " + count);

			balance = balance - withd_amt;
			//balance = balance;
			
			
			if (balance <= min_bal) {

				System.out.println("no more transactions allowed, min balance reached!");
				break;
				
			}
			count++;

		}

	}

}
