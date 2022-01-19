package kndi;

import java.util.HashSet;
import java.util.Set;





public class UniqueCHars {

	
	
	private static  boolean findIfUniquieCharsJava8(String s) {

		Set<Character> set = new HashSet();
		

		
		boolean isDups = s.chars().mapToObj(e->(char)e).peek(e->System.out.println(e)).anyMatch(e->!set.add(e));
		
		return !isDups;
	}
	
	
	

	private static  boolean findIfUniquieCharsEffecient(String s) {

		Set<Character> set = new HashSet();
		
		boolean[] bArray = new boolean[s.length()];
		char[] cArray = new char[s.length()];
		
		
		for(char c : s.toCharArray()) {
			
			
			
		}
		
		
		boolean isDups = s.chars().mapToObj(e->(char)e).peek(e->System.out.println(e)).anyMatch(e->!set.add(e));
		
		return !isDups;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(findIfUniquieCharsJava8("abcnea"));
		
	}
	
	
	
	

}
