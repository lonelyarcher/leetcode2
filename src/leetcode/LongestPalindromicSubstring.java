package leetcode;

public class LongestPalindromicSubstring {

	 private int max = 1;
	 private int left = 0;
	 private int right = 0;
	 public String longestPalindrome(String s) {
		 if(s==null || s.length()==0) return "";
		 for(int i=0;i<s.length();i++){
			 expand(i-1,i+1,s);
			 expand(i,i+1,s);			 
		 }
	     return s.substring(left,right+1);
	  }
	 
	 public void expand(int l, int r, String s){
		 if(l<0 || r>=s.length() || s.charAt(l)!=s.charAt(r)) {
			 if(r-l-1>max){
				 max = r-l-1;
				 left = l+1;
				 right = r-1;
			 }
		 }
		 else expand(l-1,r+1,s);
	 }
}
