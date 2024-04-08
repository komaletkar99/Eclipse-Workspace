package CloudvandanaAssesment;

import java.util.Scanner;

public class romanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int res=0;
		int prev=0;
		
		for(int i=str.length()-1; i>=0 ;i--) {
			char currentchar = str.charAt(i);
			int currval;
			
			switch(currentchar) {
			case 'I':
				currval=1;
				break;
				
			case 'V':
				currval=5;
				break;
				
			case 'X':
				currval=10;
				break;
				
			case 'L':
				currval=50;
				break;
				
			case 'C':
				currval=100;
				break;
				
			case 'D':
				currval=500;
				break;
				
			case 'M':
				currval=1000;
				break;
				
			default:
				currval=0;
				
			}
			
			if(currval < prev) {
				res -= currval;
			}
				
			else {
				res += currval;
			}
			prev = currval;
		}
		System.out.println(str + " = " + res);
		
	}

}
