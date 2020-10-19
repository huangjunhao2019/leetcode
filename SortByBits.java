import java.util.Arrays;
import java.util.Comparator;
class Bit{
    private int num;
    private int sum;
    Bit(int num,int sum){
        this.num=num;
        this.sum=sum;
    }
    public int get_num(){
        return this.num;
    }
    public int get_sum(){
        return this.sum;
    }
}
public class SortByBits{
    public static void main(String[] args){
        int[] arr={
            0,1,2,3,4,5,6,7,8
        };
        int[] result=sortByBits(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int summary(int num){
        int sum=0;
        while(num!=0){
            sum+=num%2;
            num=num/2;
        }
        return sum;
    }
    public static int[] sortByBits(int[] arr){
        Bit[] bit=new Bit[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=summary(arr[i]);
            bit[i]=new Bit(arr[i],sum);
        }
        Comparator cmp=new MyComparator();
        Arrays.sort(bit,cmp);
        int[] result=new int[arr.length];
        for(int i=0;i<bit.length;i++){
            result[i]=bit[i].get_num();
        }
        return result;
    }
}
    class MyComparator implements Comparator<Bit>{
        public int compare(Bit b1,Bit b2){
            if(b1.get_sum()!=b2.get_sum())
                return b1.get_sum()-b2.get_sum();
            return b1.get_num()-b2.get_num();
        }
    }

