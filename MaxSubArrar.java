public class MaxSubArrar{
	public static void main(String[] args){
		int[] a={-2,1,-3,4,-1,2,1,-5,4};
		int temp=maxSubArray(a);
		System.out.println(temp);
	}
	public static int maxSubArray(int[] nums){
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		int result=nums[0];
		for(int i=1;i<nums.length;i++){
			dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
			result=Math.max(result,dp[i]);
		}
		return result;
	}
}
