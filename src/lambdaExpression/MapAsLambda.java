package lambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class MapAsLambda {

	public MapAsLambda() {
		System.out.println("Inside constructor..");
	}
	
	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Hello");
		hm.put(2, "World");
		
		hm.forEach((k,v) -> System.out.println("Key is : "+k +" and the Value is :"+v));
	}
}
