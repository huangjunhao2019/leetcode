public class NotSame{
	public static void main(String[] args){
		char[] a={'a','a','b','c','c'};
		char b=0;
		System.out.println(b);
		for(int i=0;i<a.length;i++)
			b^=a[i];
		System.out.println(b);
	}
}
