public class MinDeletionSize{
	public static void main(String[] args){
		String[] A={"cba","daf","ghi"};
		int size=minDeletionSize(A);
		System.out.println(size);
	}
	public static int minDeletionSize(String[] A){
		int num=0;
		for(int i=0;i<A[0].length();i++){
			String temp="";
			for(int j=0;j<A.length;j++){
				temp=temp+A[j].charAt(i);
			}
			boolean flag=notDown(temp);
			if(!flag)
				num++;
		}
		return num;
	}
	public static boolean notDown(String temp){
		for(int i=0;i<temp.length()-1;i++)
			if(temp.charAt(i)>temp.charAt(i+1))
				return false;
		return true;
	}
}
