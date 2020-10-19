import java.util.Arrays;
import java.util.HashMap;
public class BullCow{
	public static void main(String[] args){
		String secret="1123";
		String guess="0111";
		System.out.println(getHint(secret,guess));
	}
	public static String getHint(String secret,String guess){
		char[] s=secret.toCharArray();
		char[] g=guess.toCharArray();
		int A=0;
		int B=0;
		for(int i=0;i<s.length;i++){
			if(s[i]==g[i])
				A++;	
		}
		int[] bucket=new int[10];
		for(int i=0;i<s.length;i++){
			bucket[s[i]-'0']++;
			bucket[g[i]-'0']--;
		}
		int cow=0;
	        for(int i=0;i<10;i++){
			if(bucket[i]>0)
				cow+=bucket[i];
		}
		B=g.length-cow-A;//这个地方的思路是减去没有匹配的，剩下的就是
		//匹配了多少次，然后减去恰好完全匹配的
		String result=A+"A"+B+"B";
		return result;

	}
}
