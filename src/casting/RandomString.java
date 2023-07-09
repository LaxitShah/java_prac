package casting;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {

		Random r = new Random();
		for (int i = 65; i < 91; i++) {

			int rno = r.nextInt(100);
			System.out.println((char) i + ""+rno);
		}

	}
}
