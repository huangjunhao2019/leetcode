import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
public class Intersection{
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Vector<Integer> temp=intersection(nums1,nums2);
        System.out.println(temp.toString());
        int[] result=intersection2(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    public static Vector<Integer> intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int value:nums1){
            set1.add(value);
        }
        for(int value:nums2){
            set2.add(value);
        }
        Vector<Integer> vec=new Vector<>();
        for(int value:set1){
            if(set2.contains(value)){
                vec.add(value);
            }
        }
        return vec;
    }
    public static int[] intersection2(int[] nums1,int[] nums2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int value:nums1){
            set1.add(value);
        }
        for(int value:nums2){
            set2.add(value);
        }
        Vector<Integer> vec=new Vector<>();
        for(int value:set1){
            if(set2.contains(value)){
                vec.add(value);
            }
        }
        int[] result=new int[vec.size()];
        vec.copyInto(result);
        return result;
    }

}
