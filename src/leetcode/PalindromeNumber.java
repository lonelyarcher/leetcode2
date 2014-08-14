package leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(int x) {
        long ret = 0;
        if(x<0)return false;
        int y=x;
		while(x>0){
        	ret = ret*10+x%10;
        	x=x/10;
        }
		return ret==y;
    }

}
