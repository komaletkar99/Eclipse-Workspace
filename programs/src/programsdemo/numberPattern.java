package programsdemo;

public class numberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

		// star pattern
		
		for(int i=1;i<=n;i++) {
			for(int j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}