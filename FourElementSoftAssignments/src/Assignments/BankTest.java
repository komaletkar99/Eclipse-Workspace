package Assignments;

public class BankTest {

	public static void main(String[] args) {
		setBalance ob = new setBalance();
	    ob.setBalance(12000);
		ob.setWithdrawAmount(5000);
		ob.setDepositeAmount(2000);
		
		ob.displaybalance(ob.getBalance());
		ob.amountWithrow(ob.getBalance(),ob.getWithdrawAmount());
		ob.DepositeAmount(ob.getBalance(),ob.getDepositeAmount());

		
		
		
	}

}
