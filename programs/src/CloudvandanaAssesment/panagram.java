package CloudvandanaAssesment;

import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s.toLowerCase();
		boolean isPangram=true;
		for(char i = 'a' ; i <= 'z'; i++) {
				if(s.indexOf(i)==-1) {
					isPangram=false;
					break;
				}
			}
			if(isPangram) {
				System.out.println("The string is panagram");
			}else {
				System.out.println("The string is not a panagram");
			}
		}
	}


