package practice;

public class primenumbetweenrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int count=0;
		System.out.println("Prime num of range : ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count = count+1;
				
			}
			
		//}
		//for(int i=1;i<=n;i++) {
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
