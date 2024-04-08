package programsdemo;

public class nonDuplicatenumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,1,2,4};
		int i,j=0;
		int n = arr.length;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((i!=j) && arr[i] == arr[j]) {
//					System.out.println(arr[j]);
					break;
				}
				
			}
		
		if(j==n) {
			System.out.println(arr[i]);
		}
		}

	}

}
