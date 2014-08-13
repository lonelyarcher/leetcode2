package leetcode;

public class MedianOfTwoSortedArrays {
	
	public  double findMedianSortedArrays(int A[], int B[]) {
		if (A.length == 0 && B.length == 0)
			return 0;
		if (A.length == 0)
			return B.length % 2 == 0 ? (B[B.length / 2] + B[B.length / 2 - 1]) / 2.0
					: B[B.length / 2];
		if (B.length == 0)
			return A.length % 2 == 0 ? (A[A.length / 2] + A[A.length / 2 - 1]) / 2.0
					: A[A.length / 2];
			return binarySearch(A, B, 0, A.length - 1);
	}

	private  double binarySearch(int[] A, int[] B, int begin, int end) {
		if (begin > end)
			return binarySearch(B, A, 0, B.length - 1);
		int m = A.length;
		int n = B.length;
		int i = (begin + end) / 2;
		int j = (m + n) / 2 - i;
		if (j == n && A[i] >= B[j - 1])
			return getMedian(A,i,B);
		if (j >= n)
			return binarySearch(A, B, i + 1, end);
		if (j == 0 && A[i] <= B[0])
			return getMedian(A,i,B);
		if (j <= 0 || A[i] > B[j])
			return binarySearch(A, B, begin, i - 1);
		if (A[i] >= B[j - 1] && A[i] <= B[j])
			return getMedian(A,i,B);
		return binarySearch(A, B, i + 1, end);
	}
	
	private  double getMedian(int[] A, int i, int[] B){
		if ((A.length + B.length) % 2 == 1) return A[i];
		else {
			int j = (A.length+B.length)/2-i-1;
			if(i==0) return (A[i]+B[j])/2.0;
			if(j<0) return (A[i]+A[i-1])/2.0;
			return (A[i]+Math.max(A[i-1],B[j]))/2.0;
			}
	}
}
