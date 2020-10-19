public class Massage{
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        int result=massage(nums);
        System.out.println(result);
    }
    public static int massage(int[] nums){
        int[] dp=new int[nums.length+1];
        if(nums.length==1)
            return nums[0];
        
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        if(nums.length==2)
            return dp[1];
        dp[2]=nums[2]+dp[0];
        if(nums.length==3)
            return dp[2];
        for(int i=3;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],nums[i]+dp[i-3]);
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
        
    }
}
