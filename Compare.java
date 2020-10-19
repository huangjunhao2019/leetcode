import java.util.Arrays;
import java.util.Comparator;
/** 这个程序需要注意的地方在于声明数组时，是Integer[] a才行，不能用int[] a
 * 另外，我觉得外面实现比较好
 */
public class Compare{
	public static void main(String[] args){
		Integer[] a={1,2,3,4,0,-1,-2};
		Comparator cmp=new MyComparator();
		Arrays.sort(a,cmp);
		System.out.println(Arrays.toString(a));		
	}
}
class MyComparator implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2){
		return o2-o1;
	}
}
