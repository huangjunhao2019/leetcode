class ClimbStairs{
	public static void main(String[] args){
		int n=3;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n){
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else 
			return climbStairs(n-1)+climbStairs(n-2);
	}
}
