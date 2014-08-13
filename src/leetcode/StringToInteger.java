package leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int atoi(String str) {
    	if(str==null || str.trim().equals("")) return 0;
    	str = str.trim();
    	int sign = 1;
    	int i = 0;
    	if(str.charAt(0)=='+') i=1;
    	if(str.charAt(0)=='-') {
    		sign = -1;
    		i=1;
    	}
    	long ret=0;
    	for(;i<str.length();i++){
    		if(Character.isDigit(str.charAt(i))){
    			ret=ret*10+Integer.parseInt(str.charAt(i)+"");
    		}else break;
    		if(sign>0 && ret>= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        	if(sign<0 && ret>= (long)Integer.MIN_VALUE*(-1)) return Integer.MIN_VALUE;
    	}
    	return (int)ret*sign;
    }
}
