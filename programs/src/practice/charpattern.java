package practice;

public class charpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int alpha=65;
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+i) + " ");
			}
			System.out.println();
		}

	}

}
