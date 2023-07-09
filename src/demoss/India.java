package demoss;

class India {

	static int p;
	static int x;

	static {

		System.out.println("this is static block...");
		p = 2000;
		x = 1200;
	}

	{
		p = 1200;
		x = 2500;
	}

	int get() {

		return p + x;
	}

	public static void main(String[] args) {

		System.out.println("main...");

		System.out.println(p + x);
		// instance = cosnst
		
		India i = new India();

		System.out.println(i.get());
	}

}