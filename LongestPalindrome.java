public class LongestPalindrome{
    public static void main(String[] args){
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s){
        int max=1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                if(isPalind(temp)){
                    max=Math.max(temp.length(),max);
                }
            }
        }
        return max;
    }
    public static boolean isPalind(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }
}
