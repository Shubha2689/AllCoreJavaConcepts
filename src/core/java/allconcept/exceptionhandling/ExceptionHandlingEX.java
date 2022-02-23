package core.java.allconcept.exceptionhandling;

public class ExceptionHandlingEX {

	public static void main(String[] args) {

		System.out.println("Program is starting");
		System.out.println("Program is Processing");

		int a = 10;
		int res = a / 0;

		try {

			System.out.println(a / 2);

		} catch (ArithmeticException e) {
			System.out.println("enter iin to catch block");

		}

		System.out.println(res);

	}

}
