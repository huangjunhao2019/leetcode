import java.util.Scanner;
public class RomanToInt{
//	int index=0;
	public static int romanToInt(String s){
		int index=0;
		int end=s.length()-1;
		int sum=0;
		while(index<=end){
			if(s.charAt(index)=='I'){
			     if(index+1<=end &&(s.charAt(index+1)=='V' || s.charAt(index+1)=='X')){
				   String temp=""+s.charAt(index)+s.charAt(index+1);
				   sum+=solve(temp);
				   System.out.println(sum);
				   index+=2;
			     }
			     else{
				     sum+=1;
				     index++;
			     }
			}
			else if(s.charAt(index)=='V'){
				index++;
				sum+=5;

			}
			else if(s.charAt(index)=='X'){
                         	if(index+1<=end && (s.charAt(index+1)=='L' || s.charAt(index+1)=='C')){
					 String temp=""+s.charAt(index)+s.charAt(index+1);
				   	sum+=solve(temp);
				   	index+=2;

				}
				else{
					sum+=10;
					index++;
				}
			}
			else if(s.charAt(index)=='L'){
					sum+=50;
					index++;
			}
			else if(s.charAt(index)=='C'){
				if(index+1<=end && (s.charAt(index+1)=='D' || s.charAt(index+1)=='M')){
					 String temp=""+s.charAt(index)+s.charAt(index+1);
				         sum+=solve(temp);
				         index+=2;

				}
				else{
					sum+=100;
					index++;
				}
			}
			else if(s.charAt(index)=='D'){
			      sum+=500;
			      index++;
			}
			else if(s.charAt(index)=='M'){
				sum+=1000;
				index++;
			}
			else
				return -1;
		}
		return sum;
	}
	public static int solve(String s){
		System.out.println(s);
		if(s.equals("IV"))
			return 4;
		else if(s.equals("IX"))
		      	return 9;
		else if(s.equals("XL"))
			return 40;
		else if(s.equals("XC"))
			return 90;
		else if(s.equals("CD"))
			return 400;
		else if(s.equals("900"))
			return 900;
		else
			return -1;

	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(romanToInt(s));
   }
}
