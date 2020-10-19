/**
 * 这道题的贪心提现在于能够用10和5找零时，不用三张5
 */
public class LemonadeChange{
	public static void main(String[] args){
		int[] bills={5,5,10};
		System.out.println(lemonadeChange(bills));
	}
	public static boolean lemonadeChange(int[] bills){
		int five=0;
		int ten=0;
		for(int bill:bills){
			if(bill==5){
//				System.out.println("5 ok");
				five++;
			}
			else if(bill==10){
				if(five>0){
//					System.out.println("five "+five);
					five--;
					ten++;
				}
				else 
					return false;
			}
			else{
				if(five>0 && ten>0){
					five--;	
					ten--;
				}
				else if(five>=3)
					five-=3;
				else
					return false;
			}
		}
		return true;

	}

}

