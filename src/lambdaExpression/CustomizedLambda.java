package lambdaExpression;

import functionalInterface.NonParameterizedFI;

public class CustomizedLambda {

	public CustomizedLambda() {
		System.out.println("You have to use functional interface..?");
	}

	/**
	 * if you want to use lambda based on requirement you have to create a function
	 * interface first then use the abstrat method in functional interface
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		NonParameterizedFI s = () -> {
			System.out.println("called sample functional interface...");
			return "Something";
		};
		s.show();
		System.out.println("after calling lambda....");
	}
}
