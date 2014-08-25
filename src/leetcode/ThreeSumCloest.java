package leetcode;

import java.util.Arrays;

public class ThreeSumCloest {

	public static void main(String[] args) {
		

	}
	
    public int threeSumClosest(int[] num, int target) {
    	assert(num.length>2);
    	Arrays.sort(num);
        int closest = num[0]+num[1]+num[2];
        for(int i=0;i<num.length-2;i++){
        	int j=i+1;
        	int k=num.length-1;
        	while(j<k){
        		int sum = num[i]+num[j]+num[k];
        		if(sum>target) {
        			if(Math.abs(sum-target)<Math.abs(closest-target)){
        				closest = sum;
        			}
        			k--;
        			}
        		else if(sum<target){
        			if(Math.abs(sum-target)<Math.abs(closest-target)){
        				closest = sum;
        			}
        			j++;
        		}
        		else return target;
        	}
        }
        return closest;
    }

}
