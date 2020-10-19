import java.util.Vector;
import java.util.HashSet;
import java.util.HashMap;
public class NearDuplicate{
	public static void main(String[] args){
		int[] nums={1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate2(nums,k));
	}
	public static boolean containsNearbyDuplicate(int[] nums,int k){
		HashMap<Integer,Vector<Integer>> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))
				(map.get(nums[i])).add(i);
			else{
				Vector<Integer> vec_temp=new Vector<>();
				vec_temp.add(i);
				map.put(nums[i],vec_temp);
			}
		}
		for(int key:map.keySet()){
			Vector<Integer> vec=map.get(key);
			for(int i=1;i<vec.size();i++)
			{
				if(Math.abs(vec.get(i)-vec.get(i-1))<=k)
					return true;
			}
		}
		return false;
	}
	public static boolean containsNearbyDuplicate2(int[] nums,int k){
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++){
			if(set.contains(nums[i]))
				return true;
			set.add(nums[i]);
			if(set.size()>k)
				set.remove(nums[i-k]);
					
		}
		return true;
	}
}

	 
