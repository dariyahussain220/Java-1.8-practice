package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ListAsLambda {
	
	public ListAsLambda() {
		System.out.println("constructor for Class..");
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("adadadad");
		list.add("0000000");
		
		list.forEach(a-> System.out.println(a));
	}
}
