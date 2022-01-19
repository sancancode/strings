package kndi;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

	
	private static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();
		
		if(s.length()%2==1)
			return false;
		
		
		
		for(char c  : s.toCharArray()) {
		
				
				if(c=='{')
					stack.push('}');
				else if(c=='[')
					stack.push(']');
				else if(c=='(')
					stack.push(')');
				else if(stack.isEmpty()||stack.pop()!=c)
					return false;
					
		}
		return stack.isEmpty() ;
	}
	
	public static void main(String[] args) {
		
		boolean b = isValid("{{()}}(){}{]");
		System.out.println(b);
	}
}
