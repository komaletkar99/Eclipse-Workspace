package demoPractice;

public class maxMinDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2314597;
		int max=0;
		int min=n/10;

		while(n!=0) {
			int last = n%10;
			System.out.println(last);
			if(last>max) {
				max=last;
			}
			if(last<min) {
				min=last;
//				System.out.println(min);
			}
			n=n/10;
			System.out.println(last);
		}
		
//		System.out.println(max);
//System.out.println(min);

	}

}
