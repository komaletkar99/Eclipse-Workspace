package NelkindaSoftware;

public class rotatearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,2,5,8,9,6,3,7};
		int d = 2;
		int[] temp = new int[arr.length];
		int k=0;
		for(int i=d;i<arr.length;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<arr.length;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = temp[i];
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" ");
		}

	}

}
