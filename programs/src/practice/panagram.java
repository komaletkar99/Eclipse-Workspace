package practice;

import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s.toLowerCase();
		boolean isPanagram = true;
		for(int i='a'; i<='z';i++) {
			if(s.indexOf(i) == -1) {
				isPanagram = false;
			    break;
		}
	}
		if(isPanagram) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not Panagram");
    }
		
		
	}
}


