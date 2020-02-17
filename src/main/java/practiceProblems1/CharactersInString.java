package practiceProblems1;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharactersInString {
	
	public static void findOccurance(String input) {
		
		HashMap<Character,Integer> charMap=new HashMap<Character, Integer>();
		int count=0;
		for(int i=0;i<input.length();i++) {
			
			if(!charMap.containsKey(input.charAt(i))) {
				count=1;
				charMap.put(input.charAt(i), count);
			}
			else {
				charMap.put(input.charAt(i),(charMap.getOrDefault(input.charAt(i), count))+1);
			}
		}
		
		for(Entry<Character, Integer> e : charMap.entrySet()) {
			System.out.println(e.getKey() +" : "+e.getValue());
		}
	}

}
