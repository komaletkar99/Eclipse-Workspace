package programsdemo;

public class printDuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,1,2,4};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i!=j) && arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}

	}

}
