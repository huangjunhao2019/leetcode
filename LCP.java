public class LCP{
	public static void main(String[] args){
		String[] s={"flower","flow","flight"};
	      	System.out.println(solve(s));
	}
	public static String solve(String[] s){
		if(s.length==0)
			return "";
	        return solveBinary(s,0,s.length-1);	

	}
	public static String solveBinary(String[] s,int left,int right){
		if(left==right)
			return s[left];
		int mid=(left+right)/2;
		String leftString=solveBinary(s,left,mid);
		String rightString=solveBinary(s,mid+1,right);
		return longCommon(leftString,rightString);
	}
	public static String longCommon(String a,String b){
		int min=Math.min(a.length(),b.length());
		int index=0;
		for(int i=0;i<min;i++)
		{
			String temp=a.substring(0,i);
			if(b.indexOf(temp)!=0)
				break;
			index=i;
		}
		return a.substring(0,index);
		
	}

}
		
