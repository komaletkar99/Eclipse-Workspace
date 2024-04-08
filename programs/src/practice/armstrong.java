package practice;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=53;
		int number=n;
		int res=0;
		while(n!=0) {
			int last=n%10;
			res=res+(last*last*last);
			n=n/10;
			
		}
		if(number==res) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}

	}

}
