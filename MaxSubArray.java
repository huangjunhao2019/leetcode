public class MaxSubArray{
	public static void main(String[] args){
		int[] a={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));
	}
	public static int maxSubArray(int[] a){
		int n=a.length;
		int currSum=a[0];
		int maxSum=a[0];
		for(int i=1;i<n;i++){
			currSum=Math.max(a[i],currSum+a[i]);
			maxSum=Math.max(maxSum,currSum);
	}
	return maxSum;
	}

}
