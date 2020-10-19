import java.util.HashMap;
public class SingleNumber{
	public static void main(String[] args){
		int[] a={2,2,1};
		System.out.println(singleNumber(a));
	}
	public static int singleNumber(int[] nums){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int value=map.get(nums[i]);
				value+=1;
				map.put(nums[i],value);
			}
			else
				map.put(nums[i],1);
		}
		for(int key:map.keySet()){
			if(map.get(key)==1)
				return key;
		}
		return -1;
	}
	
}
