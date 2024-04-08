package Assignments;

public abstract class Kotak implements Bank {

	@Override
	public void displaybalance(int balance) {
		System.out.println("Total balance : " + balance);
		
	}

	@Override
	public abstract void amountWithrow(int balance,int withrowAmount);

	@Override
	public abstract void DepositeAmount(int balance,int depositeAmount);
	

}
