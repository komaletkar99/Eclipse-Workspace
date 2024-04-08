package NelkindaSoftware;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,8,9,7,6,3,2};
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++){
				if(arr[j] > arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
