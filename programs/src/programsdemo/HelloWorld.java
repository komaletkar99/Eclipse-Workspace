package programsdemo;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.Stack;
class HelloWorld {
    public static int validParenthesis(String s){
        int max_val=0;
        int start=-1;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
        
               if(st.isEmpty()){
                   start=i;
               }
               else{
                  st.pop();
                   if(st.isEmpty()){
                       max_val = Math.max(max_val, i-start);
                   }
                       else{
                       max_val = Math.max(max_val, i-st.peek());
                   }
                   }
               }
            }
        
        return max_val;
    }
    
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        String s = "(()))())";
        int result = obj.validParenthesis(s);
        System.out.println(result);
        
    }
}