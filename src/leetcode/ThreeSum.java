package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] num = {-2,-1,0,1,2,3};
		System.out.println(threeSum(num));
	}
	
    public static List<List<Integer>> threeSum(int[] num) {
    	Set<List<Integer>> set = new HashSet<List<Integer>>();
    	Arrays.sort(num);
    	
    	int n =  num.length;
    	for(int i=0;i<n-2;i++){
    		int j=i+1;
    		int k=n-1;
    		while(j<k){
    			int sum = num[i]+num[j]+num[k];
    			if(sum>0) k--;
    			else if(sum==0){
    				List<Integer> list = new ArrayList<Integer>();
    				list.add(num[i]);
    				list.add(num[j]);
    				list.add(num[k]);
    				set.add(list);
    				k--;
    				j++;
    			}else j++;
    		}
    	}
    	return new ArrayList(set);
    }

}
