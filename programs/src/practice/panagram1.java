package practice;

import java.util.Scanner;

public class panagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		String s = sc.next();
		s.toLowerCase();
		boolean isPanagram=true;
		for(char i = 'a';i<='z';i++) {
		if(s.indexOf(i)==-1) {
				isPanagram = false;
			}
		}
		if(isPanagram) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("not Panagram");
		}
	}

}
