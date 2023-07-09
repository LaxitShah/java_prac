import java.util.Scanner;

public class DataTypeDemo {

	boolean withdraw() {

		int bal = 20000;
		System.out.println("pls enter amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int amnt = sc.nextInt();

		bal = bal - amnt;
		
		boolean flag = false;
		
		if (amnt > 1000) {

			flag = true;
		}
		System.out.println(bal);

		return flag;
	}

	void sms(boolean flag) {

		if (flag) {

			System.out.println("success");
		} else {
			System.out.println("not sucess");
		}

	}

	public static void main(String[] args) {

		DataTypeDemo d = new DataTypeDemo();

		
		
		
		if (d.withdraw()) {

			d.sms(true);
		} else {

			d.sms(false);
		}

	}

}
