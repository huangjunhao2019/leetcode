import java.util.HashMap;
public class UniqueChar{
	public static void main(String[] args){
		String a="leetcode";
		System.out.println(firstUniqChar(a));
	}
	public static int firstUniqChar(String a){
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<a.length();i++){
			if(map.containsKey(a.charAt(i))){
				int value=map.get(a.charAt(i));
				value++;
				map.put(a.charAt(i),value);
			}
			else{
				map.put(a.charAt(i),1);
			}
		}
		for(int i=0;i<a.length();i++){
			if(map.get(a.charAt(i))==1)
				return i;
		}
		return -1;
	}
}
