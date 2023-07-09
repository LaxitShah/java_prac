import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DEmo111 {

	

	public static void main(String[] args) {

		
	}
	public BufferedWriter demo5() throws IOException{
		
		
		return new BufferedWriter(new FileWriter("abcd.txt"));
	}

	public void method1() {

		try {
			br = new BufferedWriter(new FileWriter("abcd"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method2() {

			try {
				br = new BufferedWriter(new FileWriter(""));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
