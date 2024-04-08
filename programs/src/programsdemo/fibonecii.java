package programsdemo;

public class fibonecii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int c=0;
		int a=0,b=1;
		System.out.print(a +" ");
		System.out.print(b + " ");
		for(int i=2;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c+" ");
		}

		

	}

}
