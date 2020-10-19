import java.util.HashMap;
public class SameCons{
	public static void main(String[] args){
		String a="egg";
		String b="add";
		System.out.println(isIsomorphic(a,b));
	}
	public static boolean isIsomorphic(String a,String b){
		return solve(a,b) && solve(b,a);
	}
	public static boolean solve(String a,String b){
		HashMap<Character,Character> map=new HashMap<>();
		if(a.length()!=b.length())
			return false;
		int len=a.length();
		for(int i=0;i<len;i++){
			char temp1=a.charAt(i);
			char temp2=b.charAt(i);
			if(map.containsKey(temp1)){
			       if(map.get(temp1)!=temp2)
			       		return false;	       
			}
			else{
				map.put(temp1,temp2);
			}
		}
		return true;
	}
}
