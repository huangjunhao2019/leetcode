public class Solution{
	/**
	 * 这道题目的关键是搞清楚/10再乘以10，本质上是去掉十位数,所以只要保证十位数大小即可
          注意Java中Integer.MAX_VALUE	
       	*/
	public static void main(String[] args){
		int x=-1234;
		int sum=0;
		while(x!=0){
			if(sum>INT_MAX/10 || sum==INT_MAX/10 && x%10>INT_MAX%10)
				return 0;
			if(sum<INT_MIN/10 || sum==INT_MAX/10 && x%10<INT_MIN%10)
				return 0;
			sum=sum*10+x%10;
			x=x/10;
		}
		System.out.println(sum);
	}
}
