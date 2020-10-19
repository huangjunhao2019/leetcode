import java.util.Arrays;
import java.util.HashMap;
public class RelativeSortArray{
    public static void main(String[] args){
        int[] arr1={
            2,3,1,3,2,4,6,7,9,2,19
        };
        int[] arr2={
            2,1,4,3,9,6
        };
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int value:arr1){
            if(map.containsKey(value)){
                int time=map.get(value)+1;
                map.put(value,time);
            }
            else{
                map.put(value,1);
            }
        }
        int[] arr_result=new int[arr1.length];
        int k=0;
        for(int value:arr2){
            for(int i=0;i<map.get(value);i++){
                arr_result[k]=value;
                k++;
            }
            map.remove(value);
        }
        int[] temp=new int[arr1.length-k];
        int index=0;
        for(int key:map.keySet()){
            for(int i=0;i<map.get(key);i++){
                temp[index]=key;
                index++;
            }
        }
        Arrays.sort(temp);
        for(int i=k;i<arr1.length;i++)
            arr_result[i]=temp[i-k];
        return arr_result;
    }
}
