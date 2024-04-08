package Assignments;

public abstract class BankImpl extends Kotak{
	
	public void displaybalance(int balance) {
		System.out.println("Current Balance : " + balance);
		
	}

	public void amountWithrow(int balance, int withrowAmount) {
		System.out.println("Withdrowing amount : " + withrowAmount);
		
		if(balance >= withrowAmount) {
			balance -= withrowAmount;
			System.out.println("money withdraw is sucessful ");
			 displaybalance(balance);
		}
		else {
			System.out.println("Insufficient Funds ! ");
		}
//	   System.out.println(balance);
		
	}

	public void DepositeAmount(int balance,int depositeAmount) {
		System.out.println("Depositing amount : " + depositeAmount);

		balance =balance + depositeAmount;
		System.out.println("Money has been sucessfully deposited");
		displaybalance(balance);
		System.out.println(balance);
		
	}
                 		

}
