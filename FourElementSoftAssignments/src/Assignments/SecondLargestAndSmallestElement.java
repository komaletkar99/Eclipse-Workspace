package Assignments;

public class SecondLargestAndSmallestElement {
	public int FindSecondLargest(int[] arr, int n) {
		int secondLargest = 0;
		int largest = 0;
		largest = arr[0];
		secondLargest = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public int FindSecondSmallest(int[] arr, int n) {
		int secondSmallest = 0;
		int smallest = 0;
		smallest = arr[0];
		secondSmallest = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 3, 9, 7 };
		int n = arr.length;
		SecondLargestAndSmallestElement ob = new SecondLargestAndSmallestElement();
		int secondSmallest = ob.FindSecondSmallest(arr, n);
		int secondLargest = ob.FindSecondLargest(arr, n);
		System.out.println("Second Smallest : " + secondSmallest + " \n" + "Second Largest : " + secondLargest);

	}

}
