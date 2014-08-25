package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int maxArea = 0;
	public int maxArea(int[] height){
		if(height==null || height.length<2) return 0;
		int n = height.length;	
		int l = 0, r=n-1;
		while(l<r){
			maxArea=Math.max(maxArea, Math.min(height[l], height[r])*(r-l));
			if(height[l]<height[r]){
				int lH = height[l++];
				while(l<r-1 && height[l]<=lH) l++;
			}else{
				int rH = height[r--];
				while(r>l+1 && height[r]<=rH) r--;
			}
		}
		return maxArea;
	}
}
