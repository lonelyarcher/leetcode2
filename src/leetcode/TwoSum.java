package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] ret = new int[2];
        for(int i=0;i<numbers.length;i++){
            int p = target-numbers[i];
            if(map.containsKey(p)) {
                int j = map.get(p);
                if(i<j){
                ret[0] = i+1;
                ret[1] = j+1;
                return ret;
                }
                if(i>j){
                ret[0] = j+1;
                ret[1] = i+1;
                return ret; 
                }
            }
            map.put(numbers[i],i);
        }
        return null;
    }

}
