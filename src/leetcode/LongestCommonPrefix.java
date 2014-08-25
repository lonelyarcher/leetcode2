package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		String p = strs[0];
		int n = p.length();
		for(int i=1;i<strs.length;i++){
			int j=0;
			for(;j<n;j++){
				if(j>=strs[i].length() || p.charAt(j)!=strs[i].charAt(j)) break;
			}
			n = j;
			if(n==0)break;
		}
		return p.substring(0,n);
	}
}
