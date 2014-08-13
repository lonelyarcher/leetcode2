package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int reverse(int x) {
		int sign = (x>=0)?1:-1;
		x = x*sign;
		int ret = 0;
		while(x>0){
			ret = ret*10+x%10;
			x=x/10;
		}
		return ret*sign;
	}

}
