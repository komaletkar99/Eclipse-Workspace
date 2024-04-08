package programsdemo;

import java.util.Stack;
public class parenthesisbalance {
	public static int validParenthesis(String s) {
	int max_val=0;
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
					max_val=Math.max(max_val, i-start);
				}
				else {
					max_val=Math.max(max_val, i-st.peek());
				}
			}
		}
	}
	return max_val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parenthesisbalance obj = new parenthesisbalance();
		String s = "(()))())";
		int result=obj.validParenthesis(s);
		System.out.println(result);

	}

}
