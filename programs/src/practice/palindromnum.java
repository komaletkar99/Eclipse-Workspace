package practice;

public class palindromnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 12351;
		int number=n;
		int rev=0;
		while(n>0) {
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		if(number==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
