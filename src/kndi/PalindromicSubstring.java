package kndi;

import java.util.stream.IntStream;

public class PalindromicSubstring {
	static  int  result = 0;
	    public static int countSubstrings(String s) {
	    
	    	if(s==null || s.length()==0)
	    		return 0;
	    	
	    	
	    	for(int i=0; i<s.length(); i++) {
	    		
	    		extendPalindrome(s, i, i);
	    		extendPalindrome(s, i, i+1);
	    		
	    	}
	    	
	    	return result;
			IntStream
	    }
	    
	    
	    private static void extendPalindrome(String s, int begin, int begin1) {

	    	
	    	while((begin>=0 && begin1<s.length())  && (s.charAt(begin)==s.charAt(begin1))) {
	    		
	    		result++;
	    		begin--;
	    		begin1++;
	    		
	    	}
		}
	    
	    
	    public static void main(String[] args) {
			int cout = countSubstrings("aba");
			System.out.println(cout);
		}
}
