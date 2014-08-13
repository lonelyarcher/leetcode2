package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatedCharacter {
	
	
	public int lengthOfLongestSubstring(String s) {
    	int front = 0;
    	int back = 0;
    	int length =0;
    	Set<Character> set = new HashSet<Character>();
    	for(;front<s.length();front++){
    		char c1 = s.charAt(front);
    		if(!set.contains(c1)){
    			set.add(c1);
    			  			
    		}else{
    			length = Math.max(length, front-back);
    			while(s.charAt(back)!=c1){
    				set.remove(s.charAt(back));
    				back++;
    			}
    			back++;
    		}    		
    	}    	
        return Math.max(length,front-back);
    }

}
