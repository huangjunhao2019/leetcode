import java.util.Arrays;
public class LargestSum{
	public static void main(String[] args){
		int[] A={3,-1,0,2};
		int k=3;
		int temp=largestSumAfterKNegations(A,k);
		System.out.println(temp);
	}
	public static int largestSumAfterKNegations(int[] A,int k){
		solve(A,k);
		int summary=sum(A);
		return summary;
	}
	public static void  solve(int[] a,int k){
		if(k==0)
			return;
		Arrays.sort(a);
		a[0]*=-1;
		solve(a,k-1);
	}
	public static int sum(int[] a){
		int summary=0;
		for(int i=0;i<a.length;i++)
			summary+=a[i];
		return summary;
	}
}
