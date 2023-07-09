package demoss;

public class LabledLoop {

	public static void main(String[] args) {

		int i = 0;
		outer: while (true) {

			System.out.println("this is outer while loop:-");
			while (true) {

				i++;
				System.out.println("i = " + i);
				if (i == 1) {

					continue;
				}
				if (i == 3) {

					System.out.println("inside ineer loop i == 3");
					continue outer;
				}
				if (i == 6) {

					System.out.println("after break i == 6");
					break;
				}
				if (i == 10) {

					System.out.println("after break outer i == 10");
					break outer;

				}

			}
			

		}

	}
}
