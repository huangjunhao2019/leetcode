public class TheDifference{
	public static void main(String[] args){
		String s="abcd";
		String t="abcde";
		System.out.println(findTheDifference(s,t));
	}
	public static char findTheDifference(String s,String t){
		int[] bucket=new int[26];
		for(int i=0;i<t.length();i++){
			if(i<s.length())
				bucket[s.charAt(i)-'a']--;
			bucket[t.charAt(i)-'a']++;
		}
		char result='a';
		for(int i=0;i<bucket.length;i++)
			if(bucket[i]!=0){
				result=(char)(i+'a');
			}
		return result;
	}

}
