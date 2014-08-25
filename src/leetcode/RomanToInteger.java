package leetcode;

public class RomanToInteger {

	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();
		System.out.println(rti.romanToInt("DIV"));

	}

	
	int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	String[] r = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public int romanToInt(String s) {
		if(s==null || s.length()==0) return 0;
		return helper(s,0);
	}
	
	private int helper(String s, int i){
		if(i>=s.length()) return 0;
		if(i==s.length()-1) return check(String.valueOf(s.charAt(i)));
		else {
			int ret = check(s.charAt(i)+""+s.charAt(i+1));
			if(ret>0) return ret+helper(s,i+2);
			else return check(String.valueOf(s.charAt(i)))+helper(s,i+1);
		}
	}
	
	private int check(String s){
		for(int i=0;i<r.length;i++){
			if(r[i].equals(s)) return n[i];
		}
		if(s.length()==2) return -1;
		else throw new RuntimeException("bad roman number");
	}

}
