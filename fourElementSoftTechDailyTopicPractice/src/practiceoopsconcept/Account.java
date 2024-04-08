package practiceoopsconcept;

public abstract class Account implements Bank {

	@Override
	public void displayBalance(int balance) {
		System.out.println("Total balance is : " + balance);		
	}

	@Override
	public abstract void withdraw(int withamount);

	@Override
	public abstract void deposite(int depoamount) ;

	@Override
	public void balEnquary() {
		System.out.println("Please show my balance");
		
	}

}
