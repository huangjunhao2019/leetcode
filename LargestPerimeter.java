import java.util.Arrays;
public class LargestPerimeter{
    public static void main(String[] args){
        int[] A={3,2,3,4};
        int result=largestPerimeter(A);
        System.out.println(result);
    }
    public static int largestPerimeter(int[] A){
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            int max=A[i];
            int med=A[i-1];
            int min=A[i-2];
            if(med+min>max)
                return max+med+min;
        }
        return 0;
    }
}
