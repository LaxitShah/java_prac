package exception;

class AgeValidator {

	public static void validate(int age) throws InvalidAgeException {

		if (age < 18) {

			System.out.println("pls enter valid age");
			throw new InvalidAgeException("pls enter valid age");

			// empty

			// TODO Auto-generated catch block

		}

	}

}

public class CustomDemo {

	public static void main(String[] args) throws InvalidAgeException {

		AgeValidator.validate(15);
	}

}
