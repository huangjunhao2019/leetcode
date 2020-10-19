import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
public class SortString{
    public static void main(String[] args){
        String s="leetcode";
        String result=sortString(s);
        System.out.println(result);
    }
    public static String sortString(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int value=map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i),value);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
       char[] temp=new char[map.size()];
       int k=0;
       for(char value:map.keySet()){
           temp[k]=value;
           k++;
       }
       Arrays.sort(temp);
       int flag=1;
       int index=0;
       String result="";
       while(index<s.length()){
           if(flag==1){
               //正着排序
                for(int i=0;i<temp.length;i++){
                    if(map.get(temp[i])!=0){
                        int value=map.get(temp[i]);
                        value--;
                        map.put(temp[i],value);
                        index++;
                        String temp_string=""+temp[i];
                        result=result.concat(temp_string);
                    }
                }
                flag*=-1;
           }
           else{
               //反着排序
               for(int i=temp.length-1;i>=0;i--){
                   if(map.get(temp[i])!=0){
                       int value=map.get(temp[i]);
                       value--;
                       map.put(temp[i],value);
                       index++;
                       String temp_string=""+temp[i];
                       result=result.concat(temp_string);
                   }
               }

               flag*=-1;
           }
       }
       return result;

    }
}
