package kndi;

import java.util.Set;

public class MaxVowelSubstring {
	
	public static void main(String[] args) {
		
		maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33);
	}
	
	  public static int maxVowels(String s, int k) {
	        
	        System.out.println(s.length());
	        
	        Set<Character> set= Set.of('a','e','i','o','u');
	        
	        int[] arr = new int[s.length()];
	        
	        arr[0] = set.contains(s.charAt(0))?1:0;
	        
	        for(int i=1; i<s.length(); i++){
	            
	            if(set.contains(s.charAt(i)))
	                arr[i] = 1+arr[i-1];
	            else
	                arr[i] = arr[i-1];
	            
	        }
	        
	        int max = arr[k-1];
	        
	        for(int i=k ; i<s.length(); i++){
	        		max = Math.max(max, arr[i]-arr[i-k]);
	        }
	        
	        return max;
	    }

}
