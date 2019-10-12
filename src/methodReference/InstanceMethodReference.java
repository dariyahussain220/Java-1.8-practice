package methodReference;

import functionalInterface.NonParameterizedFI;

/**
 * 1. Method reference to an instance method of an object –
 * object::instanceMethod
 * 
 * @author Dhariya
 *
 */

public class InstanceMethodReference {

	public String myMethod() {
		System.out.println("Instance Method");
		return "empty String";
	}

	public static void main(String[] args) {
		InstanceMethodReference obj = new InstanceMethodReference();

		/**
		 * This wont work as Object is a class where as it requires functional interface
		 * reference
		 **/
//		Object o = obj::myMethod;

		/**
		 * This will work because NonParameterizedFI is functional interface
		 */
		NonParameterizedFI o = obj::myMethod;
		// Method reference using the object of the class

	}
}
