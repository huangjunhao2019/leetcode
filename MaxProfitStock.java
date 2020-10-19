public class MaxProfitStock{
	public static void main(String[] args){
		int[] profit={7,1,5,3,6,4};
		System.out.println(maxProfit(profit));
	}
	public static int maxProfit(int[] price){
		int sum=0;
		for(int i=1;i<price.length;i++){
			int diff=price[i]-price[i-1];
			if(diff>0)
				sum+=diff;
		}
		return sum;
	}

}
