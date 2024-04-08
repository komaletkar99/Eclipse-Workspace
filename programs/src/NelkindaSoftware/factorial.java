package NelkindaSoftware;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		   int n = sc.nextInt();
	        int fact = 1;
	        for(int i=1;i<=n;i++){
	            fact = fact * i;
	        }
	        System.out.println("The factorial of the given number is : " + fact);
	}
	}

// Test cases

//Enter number : 5
//output: The factorial of the given number is : 120

//Enter number : 6
//output: The factorial of the given number is : 720

//Enter number : 7
//output: The factorial of the given number is : 5040

//Enter number : 3
//output: The factorial of the given number is : 6

//Enter number : 4
//output: The factorial of the given number is : 24

