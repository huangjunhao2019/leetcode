import java.util.Vector;
public class IntVector{
	public static void main(String[] args){
		Vector<Integer> vec=new Vector<Integer>();
		for(int i=0;i<10;i++){
			vec.add(Integer.valueOf(i));
		}
		int sum=0;
		for(Integer a: vec){
			sum+=a;
		}
		System.out.println(sum);
	}
}
