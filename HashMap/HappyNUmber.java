import java.util.Vector;
public class HappyNumber{
	public static void main(String[] args){
		int num=19;
		System.out.println(isHappy(num));
	}
	public static boolean isHappy(int n){
		if(n==1)
			return true;
		String s=Integer.toString(n);
		Vector<Integer> vec=new Vector<>();
		for(int i=0;i<s.length();i++){
			int temp=s.charAt(i)-'0';
			vec.add(temp);
		}
		int sum=0;
		for(int value:vec){
			sum+=value*value;
		}
		return isHappy(sum);
		
	}
		
}

