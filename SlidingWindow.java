import java.util.Arrays;
public class SlidingWindow{
	public static void main(String[] args){
		int[] nums={1,2,-1,-3,5,3,6,7};
		int k=3;
		int[] result=maxSlidingWindow(nums,k);
		System.out.println(Arrays.toString(result));
	}
	public static int[] maxSlidingWindow(int[] nums,int k){
		int[] max=new int[nums.length-k+1];
		for(int i=0;i<nums.length-k+1;i++)
		{
   			max[i]=maxArray(nums,i,i+k-1);	
		}
		return max;
	}
	public static int maxArray(int[] nums,int front,int end){
		int max=nums[front];
		for(int i=front;i<=end;i++)
			if(nums[i]>max)
				max=nums[i];
		return max;
	}
	
}
