import java.util.HashMap;
public class MajorityElement{
    public static void main(String[] args){
        int[] a={2,2,1,1,1,2,2};
        int result=majorityElement(a);
        System.out.println(result);
    }
    public static int majorityElement(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
               int value=map.get(a[i]);
               map.replace(a[i],value+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        int result=0;
        for(int key:map.keySet()){
            if(map.get(key)>(a.length/2))
                result=key;
        }
        return result;
    }
}
