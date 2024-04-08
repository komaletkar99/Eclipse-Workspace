package practice;

public class fibonecii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}

	}

}
