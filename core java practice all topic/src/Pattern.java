
public class Pattern {

	public static void main(String[] args) {
//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
//		
		
		int n = 5;
		int num=1;
		for(int i=1;i<=n;i++) {
		int temp = num;
			for(int j=1;j<=i;j++) {
				
				System.out.print(temp + " ");
				
				temp+=n-j;
				}
			num++;
			System.out.println();
		}

	}

}
