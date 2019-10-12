package functionalInterface;

@FunctionalInterface
public interface ParameterizedFI {

	public int secondTest(int a, int b, int c);
	
	default void t1() {
		System.out.println("t1 default method....");
	}
	
	default void t2() {
		System.out.println("t2 default method....");
	}
}
