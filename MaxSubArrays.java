public class MaxSubArray{
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxSubArray(nums);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums){
       int max=nums[0];
       int currsum=nums[0];
       if(nums.length==0)
           return max;
       for(int i=1;i<nums.length;i++){
            currsum=Math.max(currsum+nums[i],nums[i]);
            max=Math.max(max,currsum);
       }
       return max;
    }
}
