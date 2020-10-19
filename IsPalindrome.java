import java.util.Scanner;
public class IsPalindrome{
	public static  boolean isPalindrome(int x){
		String s=x+"";
		for(int i=0;i<s.length()/2;i++)
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
					return false;
		return true;
	}
	public static boolean isPalindrome2(int x){
		if(x<0)
			return false;
		int mid=0;
		while(mid<x){
			mid=mid*10+x%10;
			x/=10;
		}
		return x==mid || x==mid/10;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			int temp=scan.nextInt();
			System.out.println(isPalindrome2(temp));
		}
	}
}
