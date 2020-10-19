import java.util.Scanner;
import java.util.Vector;
/** 这种方法并不好，不是太方便，而且有大量的无用循环
 */
public class LongChild{
	public static void main(String[] args){
		String[] test={"flower","flow","flight"};
		System.out.println(longestCommonPrefix(test));

	}
	public static String longestCommonPrefix(String[] strs){
		int index=0;
		for(int i=0;i<=strs[0].length();i++){
			String temp=strs[0].substring(0,i);
			int num=1;
			for(int j=1;j<strs.length;j++){
				if(i>strs[j].length())
					break;	
				String temp_eve=strs[j].substring(0,i);
				if(temp_eve.equals(temp))
				     num++;	
			}
	//		System.out.println(temp+","+num);
			if(num==strs.length)
				index=i;
		}
		if(index>0)
			return strs[0].substring(0,index);
		else 
			return "";

	}
}

