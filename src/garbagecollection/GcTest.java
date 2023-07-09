package garbagecollection;

public class GcTest {

	GcTest x;

	public static void main(String[] args) {

		GcTest g1 = new GcTest();
		GcTest g2 = new GcTest();

		g1.x = g2;

		g2.x = g1;

		// g1 is eleigble for garbage colletion
		g1 = null;
		// g2 is eleigble for garbage colletion
		g2 = null;
		String s = new String();
		s = null;
		System.out.println(s.trim());

		//Runtime.getRuntime().gc();
		System.gc();

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Finalize called...");

	}
}
