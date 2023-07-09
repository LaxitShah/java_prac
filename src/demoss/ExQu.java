package demoss;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;

public class ExQu {

	public static void main(String[] args) {

		try {

			System.out.println((10 / 0));

		} catch (InputMismatchException e) {

		} catch (Exception e) {

			System.out.println("");
		}

	}
}
