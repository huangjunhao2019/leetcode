public class MinCostClimbingStairs{
    //递归应该尽量简单，这个问题，在于每次假设上次爬或不爬
    public static void main(String[] args){
        int[] cost={1,100,1,1,1,100,1,1,100,1};
        int result=minCostClimbingStairs(cost);
        System.out.println(result);
    }
    public static int minCostClimbingStairs(int[] cost){
        int min1=solve(cost,cost.length-1);
        int min2=solve(cost,cost.length-2);
        return Math.min(min1,min2);
    }
    public static int solve(int[] cost,int len){
        
        if(len<0) 
            return 0;
        if(len==0)
            return cost[len];
        int min1=solve(cost,len-1)+cost[len];
        int min2=solve(cost,len-2)+cost[len];
        return Math.min(min1,min2);
    }
}
