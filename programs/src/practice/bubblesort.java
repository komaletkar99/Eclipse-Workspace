package practice;

import java.util.Arrays;

class abc{
	private String name;
	private int id;
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id; 
	}
}
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {4,9,5,8,6,7,2,3,1};
//		int n = arr.length;
//		int temp=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}

		abc obj = new abc();
		obj.setId(1);
		obj.setName("Komal");
		System.out.println("The id is : " + obj.getId());
		System.out.println("The name is : " + obj.getName());
	}

}
