package functionalInterface;

@FunctionalInterface
public interface NonParameterizedFI {

	public String doTest();
	
	default void show(){
		System.out.println("Default method in interface......");
	}
}
