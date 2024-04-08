package practice;

public class maxmindigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=34156987;
//		int first=n/10;
//		int last=n%10;
//		System.out.println(last);
//		while(n!=0) {
//			 last=n%10;
//			 first=last;
//			 n=n/10;
//		}
//		
//		System.out.println(first);
		
		
		int max=0;
		int min=n/10;;
		while(n>0) {
			int last=n%10;
			if(last>max) {
				max=last;
			}
			if(last<min) {
				min = last;
			}
			n=n/10;
		}
		System.out.println(min);
		System.out.println(max);

	}

}
