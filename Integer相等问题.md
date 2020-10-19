# Integer类型在比较是否相等的问题

```java
import java.util.HashMap;
public class TestHash{
	public static void main(String[] args){
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		map1.put('a',100);
		map2.put('a',100);
		System.out.println(map1.get('a')==map2.get('a'));
	}
}
```

 
上面这个程序，在-128-127之间时显示是相等，大于128是显示不相等。这是由于Integer在-128-127之间不会创建对象，大于128时会创建对象，应该用equas
还有另一种方法，那就是 int num1=map1.get('a');int num2=map2.get('a');
这样修改，可以使之显示相等