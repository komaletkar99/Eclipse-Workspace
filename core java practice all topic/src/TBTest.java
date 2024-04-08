	import java.util.*;
		public class TBTest{
			public static void main(String[] args){
			int[] arr1 = {1,3};
			int[] arr2 = {2,6};
			int[] arr3 = {8,10};
			int[] arr4 = {15,18};

			ArrayList al = new ArrayList();
			al.add(arr1);
			al.add(arr2);
			al.add(arr3);
			al.add(arr4);

			List temp = new ArrayList();
			temp.add(arr1[0]);
			temp.add(arr2[1]);

			for(Object ob:temp){
			System.out.print(ob + " ");

			}
			for(Object ob1 : al){
			    System.out.print(ob1.toString() + " ");
			}


			}

			} 

