package demoPractice;

public class firstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country";
		String[] word = s.split("\\s");
		String first,remaning,upper;
		for(String words : word) {
			first = words.substring(0,1);
			first=first.toUpperCase();
			remaning = words.substring(1);
			upper=first+remaning;
			
			System.out.print(upper + " ");
			}
		

	}

}
