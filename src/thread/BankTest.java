package thread;

class Bank {

	int bal = 10000;
	int amount, scode;

	//5000
	synchronized void withdraw(int amount) {

		System.out.println("withdraw method called...");
		try {
			System.out.println("going to check balance...");
			this.amount = amount;  // 5000
			wait();
			if (scode == 1) {
				System.out.println("tran successful");
			} else {
				System.out.println("tran fail due to insufficien amount..");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	synchronized void chekBal() {

		System.out.println("check bal nmethod  called...");
		//5000 >1000
		if (amount > bal) {

			System.out.println("amount is not sufficient..");
			scode = 0;
			notify();
		} else {

			System.out.println("amount is sufficient..");
			scode = 1;
			notify();
		}

	}

}

public class BankTest {

	public static void main(String[] args) {

		Bank b = new Bank();
		
		
		new Thread(){
			
			public void run(){
				
				b.withdraw(11000);
			}
		}.start();
		

		new Thread(){
			
			public void run(){
				
				b.chekBal();
			}
		}.start();
	}

}
