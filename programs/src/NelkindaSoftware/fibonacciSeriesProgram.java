package NelkindaSoftware;

import java.util.Scanner;

public class fibonacciSeriesProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 int n = sc.nextInt();
	        int a = 0;
	        int b = 1;
	        int c=0;
	        System.out.print(a + " " + b + " ");
	        for(int i=2;i<n;i++){
	            c=a+b;
	            System.out.print(c + " ");
	            a=b;
	            b=c;
	        }
	}
	}

//Test cases

// Enter number :  10
// output: 0 1 1 2 3 5 8 13 21 34 

//Enter number : 5
//ouput: 0 1 1 2 3 

//Enter number : 15
//output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 

//Enter number : 20
//output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 

//Enter number : 7
//output: 0 1 1 2 3 5 8 
