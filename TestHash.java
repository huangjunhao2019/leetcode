import java.util.HashMap;
public class TestHash{
	public static void main(String[] args){
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
             	map1.put('a',1000);
		map2.put('a',1000);
		int num1=map1.get('a');
		int num2=map2.get('a');
		System.out.println(num1==num2);
	}
}
