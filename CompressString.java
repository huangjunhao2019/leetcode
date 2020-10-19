import java.util.HashMap;
public class CompressString{
    public static void main(String[] args){
        String s="aabcccaaa";
        String result=compressString2(s);
        System.out.println(result);
    }
    public static  String compressString(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int val=map.get(s.charAt(i));
                val++;
                map.put(s.charAt(i),val);
            }
            else{
                map.put(s.charAt(i),1);
                temp+=s.charAt(i);
            }
        }
        String result="";
        for(int i=0;i<temp.length();i++){
            result+=""+temp.charAt(i)+map.get(temp.charAt(i));
        }
        if(s.length()<=result.length())
            return s;
        return result;
    }
    public static String compressString2(String s){
        int i=0;
        int j=0;
        String result="";
        while(j<s.length()){
            
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
                
            }
            result+=""+s.charAt(i)+(j-i);
            i=j;
               
        }
        if(s.length()<result.length())
            return s;
        return result;
    }
}
