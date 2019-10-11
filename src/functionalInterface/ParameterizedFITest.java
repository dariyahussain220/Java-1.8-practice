package functionalInterface;

public class ParameterizedFITest {

	public static void main(String[] args) {

		// implementation done here..
		ParameterizedFI p = (a, b, c) -> System.out.println("Printing values :" + a + " " + b + " " + c);

		p.secondTest(10, 20, 30);
		p.t1();

	}

}
