package demoss;

public class BreakDemo {

	public static void main(String[] args) {

		int i = 1;

		while (true) {

			i++;
			System.out.println("i = " + i);
			if (i == 5)
				break;

		}
		System.out.println("after break statement...");

	}

}
