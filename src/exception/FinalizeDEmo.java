package exception;

public class FinalizeDEmo {

	static FinalizeDEmo f1;

	protected void finalize() {

		System.out.println("finilize invoked...");
		f1 = null;

	}

	public static void main(String[] args) {

		f1 = new FinalizeDEmo();
		System.out.println(f1.hashCode());

		
		
		System.gc();
		
		System.out.println(f1.hashCode());

		
	}
}
