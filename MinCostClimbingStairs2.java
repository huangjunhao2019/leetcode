public class MinCostClimbingStairs2{
    public static void main(String[] args){
        int[] cost={1,100,1,1,1,100,1,1,100,1 };
        int result=minCostClimbingStairs(cost);
        System.out.println(result);
    }
    public static int minCostClimbingStairs(int[] cost){
        int[] dp=new int[cost.length];
        if(cost.length<=1)
            return 0;
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<cost.length;i++){
            int min1=cost[i]+dp[i-1];
            int min2=cost[i]+dp[i-2];
            dp[i]=Math.min(min1,min2);
        }     
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
