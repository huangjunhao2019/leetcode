public class IsSubsequence{
	public static void main(String[] args){
		String s="axc";
		String t="ahbgdc";
		boolean temp=isSubsequence(s,t);
		System.out.println(temp);
	}
	public static boolean isSubsequence(String s,String t){
		
			int i=0;
			for(int j=0;j<t.length();j++){
				if(t.charAt(j)==s.charAt(i)){
					i++;		
				}
			}
			if(i==s.length())
				return true;
			else
				return false;
		
	}
}
