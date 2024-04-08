package practiceoopsconcept;

public class BankImpl extends Account {
	private int balance;
	private int withamount;
	private int depoamount;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithamount() {
		return withamount;
	}

	public void setWithamount(int withamount) {
		this.withamount = withamount;
	}

	public int getDepoamount() {
		return depoamount;
	}

	public void setDepoamount(int depoamount) {
		this.depoamount = depoamount;
	}

	@Override
	public void withdraw(int withamount) {
		System.out.println("Withdrawing amount : " + withamount);
		if (balance >= withamount) {
			balance -= withamount;
			System.out.println("money withdraw is sucessful ");
			displayBalance(balance);
			System.out.println();
			
		} else {
			System.out.println("Insufficient balance ");
		}

	}

	@Override
	public void deposite(int depoamount) {
		System.out.println("Depositing amount : " + depoamount);
		balance += depoamount;
		System.out.println("Money has been sucessfully deposited");
		displayBalance(balance);
	}

}
