package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) {

		try {
			// apen
			BufferedWriter br = new BufferedWriter(new FileWriter("employee.txt", true));

			br.write("\n java");
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
