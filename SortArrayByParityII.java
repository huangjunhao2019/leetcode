import java.util.Arrays;
public class SortArrayByParityII{
    public static void main(String[] args){
        int[] A={4,2,5,7};
        int[] B=sortArrayByParityII(A);
        System.out.println(Arrays.toString(B));
    }
    public static int[] sortArrayByParityII(int[] A){
        int i=0;//i检测偶数，j检测奇数
        int j=A.length-1;
        while(i<A.length && j>=0){
            if(i%2==0&&A[i]%2!=0){
                if(j%2==1 && A[j]%2==0){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    j--;
                    i++;
                }
                else 
                    j--;
            }
            else{
                if(j%2==1 && A[j]%2==0){
                    i++;
                }
                else{
                    i++;
                    j--;
                }

            }
        }
        return A;
    }
}
