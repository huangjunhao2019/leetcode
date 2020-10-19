import java.util.Stack;
import java.util.HashMap;
public class Bracket{
	public static void main(String[] args){
		String s="()[]";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s){
		Stack<Character> st=new Stack<>();
		HashMap<Character,Character> map=new HashMap<>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
				st.push(s.charAt(i));
			}
			if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
				if(st.empyt)
					return false;
				char a=st.pop();
				if(map.get(a)!=s.charAt(i))
					return false;

		}
		}
		return st.empty();
	}
}
