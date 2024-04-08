package programsdemo;

public class maxminDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 427596;
		int min=n/10;
		int max=0;
		while(n!=0) {
			int last = n%10;
			
			if(last>max) {
				max=last;
			}
			if(last<min) {
				min=last;
			}
			n=n/10;
		}
		
       System.out.println(min+"\n"+max);
	}

}
