package practice;

public class revdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int rev=0;
		while(n!=0) {
			int last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		System.out.println(rev);

	}

}