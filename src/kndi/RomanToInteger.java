package kndi;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	
	
	private static void toInteger(String s) {

		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int total = 0;
		
		for(int i=0; i<s.length()-1; i++) {
			
			if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
				total = total + map.get(s.charAt(i));
			}
			
			else
				total = total - map.get(s.charAt(i));
		}
		total += map.get(s.charAt(s.length()-1));
		
		System.out.println(total);
		
	}
	
	
	
	public static void main(String[] args) {
		
		toInteger("XII");
		
	}
}
