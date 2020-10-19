import java.util.HashMap;
public class Duplicate{
	public static void main(String[] args){
		int[] a={1,2,3,1};
		System.out.println(containsDuplicate(a));
	}
	public static boolean containsDuplicate(int[] nums){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int key:nums){
			map.put(key,0);
		}
		for(int key:nums){
			int temp=map.get(key);
			temp++;
			map.put(key,temp);
		}
		for(int key:map.keySet()){
			if(map.get(key)<2)
				return false;
		}
		return true;
	}
}
