import java.util.Arrays;
import java.util.Vector;
import java.util.HashSet;
import java.util.HashMap;
public class Intersect{
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] result=intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        Vector<Integer> vec=new Vector<>();
        while(i<nums1.length){
            if(j<nums2.length){

                  if(nums1[i]==nums2[j]){
                        vec.add(nums1[i]);
                        i++;
                        j++;
                   }
                  else if(nums1[i]<nums2[j]){
                        i++;
                  }
                  else{
                      j++;
                  }
            }
        }
        int[] result=new int[vec.size()];
        for(int k=0;k<vec.size();k++)
            result[k]=vec.get(k);
        return result;
    }
}
