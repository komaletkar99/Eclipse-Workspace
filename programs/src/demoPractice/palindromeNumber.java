package demoPractice;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12321;
		int number=n;
		int rev=0;
		while(n!=0) {
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		if(number==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");	
		}

	}

}
