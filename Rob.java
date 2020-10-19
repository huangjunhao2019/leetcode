/**
 * 递归版本的rob，递归不过是需要找到base case，和递归
 * 关系
 */
public class Rob{
    public static void main(String[] args){
        int[] a={2,7,9,3,1};
        System.out.println(rob(a));
    }
    public static int rob(int[] a){
        return Math.max(solve(a,0),solve(a,1));
    }
    public static int solve(int[] a,int index){
        if(index>a.length-1)
            return 0;
        if(index==a.length-1 || index==a.length-2)
            return a[index];
        int temp1=a[index]+solve(a,index+2);
        int temp2=a[index]+solve(a,index+3);
        return Math.max(temp1,temp2);
    }
}
