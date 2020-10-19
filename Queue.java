import java.util.Queue;
public class Queue{
	public static void main(String[] args){
		Queue<> a=new Queue<>();
		for(int i=0;i<10;i++)
			a.offer(i);
		for(int i:a){
			System.out.println(i);
		}
	}
}
