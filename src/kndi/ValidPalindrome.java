package kndi;

import java.util.stream.IntStream;

public class ValidPalindrome {

	
	
	
	
	
	private static boolean isPali(String s) {
		
		s = s.toLowerCase();
		String ss = s.replaceAll("[^a-zA-Z0-9]+", "");
				

		return !IntStream.range(0, ss.length()/2).anyMatch(e->ss.charAt(e)!=ss.charAt(ss.length()-1-e));
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isPali("abnnba!"));
		
	}
	
	
	
}
