package kndi;

import java.util.Stack;

public class BackSpaceCompare {

	
	 public static boolean backspaceCompare(String S, String T) {
	        
	        
	        Stack<Character> stack = new Stack();
	        
	        for(int i=0; i<S.length();i++){
	            if(S.charAt(i)!='#')
	                stack.push(S.charAt(i));
	            else if(!stack.empty())
	                stack.pop();
	        }
	        
	        Stack<Character> stack1 = new Stack();
	        
	        for(int i=0; i<T.length();i++){
	            if(T.charAt(i)!='#')
	                stack1.push(T.charAt(i));
	          else if(!stack1.empty())
	                stack1.pop();
	        }
	        
	        
	         return stack1.equals(stack);
	        
	        
	    }
	
public static void main(String[] args) {
	System.out.println(backspaceCompare("a##c", "#a#c"));
}

}	
	
