package practiceoopsconcept;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide balance : ");
		int balance = sc.nextInt();
		System.out.println("please enter withraw amount :");
		int withdrAmount = sc.nextInt();
		System.out.println("please enter deposite amount");
		int depositeAmount = sc.nextInt();
		
		BankImpl ob = new BankImpl();
		ob.setBalance(balance);
		ob.setWithamount(withdrAmount);
		ob.setDepoamount(depositeAmount);
		
		ob.displayBalance(ob.getBalance());
		ob.withdraw(ob.getWithamount());
		ob.deposite(ob.getDepoamount());

	}

}
