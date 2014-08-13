package leetcode;

public class ZigZagConversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
    
	}
	
    public static String convert(String s, int nRows) {
    	if(nRows==1) return s;
    	StringBuilder sb = new StringBuilder();
    	int n = s.length();
    	for(int i=0;i<nRows;i++){
    		for(int j=i;j<n;j+=nRows*2-2){
    			if(i==0 || i==nRows-1) sb.append(s.charAt(j));
    			else {
    				sb.append(s.charAt(j));
    				if(j+nRows*2-2-2*i<n)sb.append(s.charAt(j+nRows*2-2-2*i));
    				}
    		}
    	}
    	return sb.toString();
    }

}
