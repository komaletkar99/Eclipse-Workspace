package programsdemo;

import java.util.Stack;

public class balanceParanthesis {
	public static int parenthesis(String s) {
		int max_length=0;
		int start=-1;
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push(i);
			}
			else {
				if(st.isEmpty()) {
					start=i;
				}
				else {
					st.pop();
					if(st.isEmpty()) {
						max_length = Math.max(max_length, i-start);
					}
					else {
						max_length = Math.max(max_length, i-st.peek());
					}
				}
			}
		}
		return max_length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balanceParanthesis obj = new balanceParanthesis();
		String s = "(()))())";
		int result = obj.parenthesis(s);
		System.out.println(result);
		

	}

}
