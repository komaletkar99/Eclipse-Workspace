package programsdemo;

public class leanear {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int[] arr = {4,8,9,6,7,3};
		int target = 3;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				System.out.println(i);
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("Element not found !! ");
		}

	}

}
