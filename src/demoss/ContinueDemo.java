package demoss;

public class ContinueDemo {

	public static void main(String[] args) {

		int val[] = { 12, 13, 14, 15, 1, 6, 17, 18, 19, 20 };

		for (int i : val) {
			if (i == 15)
				continue;

			System.out.println(i);
		}
		
		

	}
}
