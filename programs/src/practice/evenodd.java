package practice;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even numbers : " + i);
			}
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println("Odd numbers : " + i);	
			}
		}

	}

}
