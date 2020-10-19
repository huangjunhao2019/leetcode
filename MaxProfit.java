public class MaxProfit{
	public static void main(String[] args){
		int[] a={7,6,4,3,1};
		System.out.println(maxProfit(a));
	}
	public static int maxProfit(int[] a){
		int max=0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int temp=a[j]-a[i];
				if(temp>max){
					max=temp;
				}
		}
	
	}
	return max;
	}

}
