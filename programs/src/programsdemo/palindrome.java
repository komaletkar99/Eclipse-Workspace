package programsdemo;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12321;
		int rev=0;
		int num=n;
		while(n!=0) {
			int last=n%10;
			rev = rev*10+last;
			n=n/10;
		}
		
		if(num==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
