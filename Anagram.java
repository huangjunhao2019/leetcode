import java.util.HashMap;
import java.util.Arrays;
public class Anagram{
	public static void main(String[] args){

         String s="anagram";
         String t="nagaram";		
	System.out.println(isAnagram(s,t));
	}
	/**
	 * 大神的算法
	 */
       public static boolean isAnagram2(String s,String t){
	       if(s.length()!=t.length())
		       return false;
	       char[] str1=s.toCharArray();
	       char[] str2=s.toCharArray();
	       Arrays.sort(str1);
	       Arrays.sort(str2);
	       return Arrays.equals(str1,str1);
       }
	 public static boolean isAnagram(String s,String t){
		if(s.length()!=t.length())
			return false;
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map1.containsKey(s.charAt(i))){
				int value=map1.get(s.charAt(i));
				value++;
				map1.put(s.charAt(i),value);				
			}
			else 
				map1.put(s.charAt(i),1);
		}
		for(int i=0;i<t.length();i++){
			if(map2.containsKey(t.charAt(i))){
			       int value=map2.get(t.charAt(i));
		               value++;
		       	       map2.put(t.charAt(i),value);	       
			}	       
			else 
				map2.put(t.charAt(i),1);
		}
		if(map1.size()!=map2.size()){
            System.out.println(map1.size()+" "+map2.size());
			return false;
    }
		for(char key:map1.keySet()){
			System.out.println(key+" "+map1.get(key)+" "+map2.get(key));
                     if(map1.get(key)!=map2.get(key)){
                System.out.println("key");
			     return false;
                     }
		}
		return true;

	}
}
