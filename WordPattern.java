import java.util.HashMap;
import java.util.Arrays;
/**
 * 这道题如果用containsValue，第二个函数就没有必要了
 */
public class WordPattern{
	public static void main(String[] args){
		String pattern="abba";
		String str="dog cat cat dog";
		System.out.println(wordPattern(pattern,str));
	}
	public static boolean wordPattern(String pattern,String str){
		return wordPattern1(pattern,str) && wordPattern2(pattern,str);
	}
	public static boolean wordPattern1(String pattern,String str){
		HashMap<Character,String> map=new HashMap<>();
		String[] a=str.split(" ");
		int array_len=a.length;
		int string_len=pattern.length();
		//System.out.println(a.length+" "+str.length());
		if(array_len!=string_len)
			return false;
		for(int i=0;i<array_len;i++){
		//	System.out.println(a[i]);
			if(map.containsKey(pattern.charAt(i))){
				String temp=map.get(pattern.charAt(i));
				if(!temp.equals(a[i]))
					return false;
			}
			else{
				map.put(pattern.charAt(i),a[i]);
			}	
		}
		return true;		
	}
	public static boolean wordPattern2(String pattern,String str){
		HashMap<String,Character> map=new HashMap<>();
		String[] a=str.split(" ");
		int array_len=a.length;
		int pat_len=pattern.length();
		if(array_len!=pat_len)
			return false;
		for(int i=0;i<array_len;i++){
			if(map.containsKey(a[i])){
				char temp=map.get(a[i]);
				if(temp!=pattern.charAt(i))
					return false;
			}
			else{
				map.put(a[i],pattern.charAt(i));
			}
		}
		return true;
	}
}

