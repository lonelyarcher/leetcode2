package leetcode;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		RegularExpressionMatching rem = new RegularExpressionMatching();
		//System.out.println(rem.isEmpty("c*a*b*",0));
		System.out.println(rem.isMatch("aa",".*"));

	}
	
	public boolean isMatch(String s, String p) {
		if(s==null || p==null) return false;
		
		return isMatch(s,0,p,0);
	}

	private boolean isMatch(String s, int sp, String p, int pp) {
		if(p.length()==0) return s.length()==0;
		char preP = '\u0000';
		while(sp<s.length()){
			if(pp>=p.length()) return false;
			if(pp>0) preP = p.charAt(pp-1);
			if(pp<p.length()-1 && p.charAt(pp+1)=='*' && isMatch(s,sp,p,pp+2)) return true;
			if(p.charAt(pp)=='.' ) return isMatch(s,sp+1,p,pp+1);
			else if(s.charAt(sp)==p.charAt(pp))  return isMatch(s,sp+1,p,pp+1);
			else if(p.charAt(pp)=='*'){
				if(s.charAt(sp)==preP || preP=='.') return isMatch(s,sp+1,p,pp) || isMatch(s,sp,p,pp+1);
				else return isMatch(s,sp,p,pp+1);
			}
			else return false;
		}
		return isEmpty(p,pp);
	}
    
	private boolean isEmpty(String p, int pp){
		if(pp>=p.length()) return true;
		if(p.charAt(pp)=='*') return isEmpty(p,pp+1);
		if(pp<p.length()-1 && p.charAt(pp+1)=='*') return isEmpty(p,pp+2);
		return false;
	}
}
