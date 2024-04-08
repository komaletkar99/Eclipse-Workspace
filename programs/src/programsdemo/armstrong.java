package programsdemo;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1634;
		int res=0;
		int num=n;
		while(n!=0) {
			int last=n%10;
			res=res+(last*last*last);
			n=n/10;
		}
         if(num==res) {
        	 System.out.println("armstrong");
         }
         else {
        	 System.out.println("Not armstrong");
         }
	}

}
