package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> fourSum(int[] num, int target) {
        Set<List<Integer>> ret = new HashSet<List<Integer>>();
        if(num.length<4)return new ArrayList<>();
        Arrays.sort(num);
        for(int i=0;i<num.length-3;i++){
        	for(int j=i+1;j<num.length-2;j++){
        		int k=j+1;
        		int l=num.length-1;
        		while(k<l){
        			int sum = num[i]+num[j]+num[k]+num[l];
        			if(sum>target){
        				l--;
        			}else if(sum<target){
        				k++;
        			}else{
        				List<Integer> list = new ArrayList<Integer>(Arrays.asList(num[i],num[j],num[k],num[l]));
        				ret.add(list);
        				l--;
        				k++;
        			}
        		}
        	}
        }
        return new ArrayList(ret);
    }

}
