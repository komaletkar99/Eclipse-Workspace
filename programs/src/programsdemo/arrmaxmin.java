package programsdemo;

public class arrmaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,1,9,8,7};
		int min,max=0;
		max=arr[0];
		min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min+"\n"+max);

	}

}
