package lambdaExpression;

public class InBuiltLambdaExample {

	public static void main(String[] args) {
		InBuiltLambdaExample inBuiltLambdaExample = new InBuiltLambdaExample();
		
		inBuiltLambdaExample.beforeJava8();
		inBuiltLambdaExample.afterJava8();
	}

	private void afterJava8() {
		Runnable r = ()-> System.out.println("after java 8");
		r.run();
	}

	private void beforeJava8() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("before java 8");
			}
		};
		r.run();
	}
}
