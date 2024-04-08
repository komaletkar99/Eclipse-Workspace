package practice;

public class firstcharuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country";
		String[] words = s.split("\\s");
		String first,remaining,upper;
		for(String word : words) {
			first = word.substring(0,1);
			first=first.toUpperCase();
			remaining=word.substring(1);
			upper=first+remaining;
			System.out.print(upper + " ");
		}
		

	}

}
