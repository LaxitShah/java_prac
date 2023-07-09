package inner;

//outer class
//member inner class DEMo

public class OuterDemo {

	private int x = 100;

	public void outerDisplay() {

		System.out.println("outer display method called...");
	}

	class Inner {

		public void display() {

			System.out.println("display method called... value of  x = " + x);
			outerDisplay();
		}

		class InsideInner extends Inner {

		}

	}

	class Inner2 extends Inner {

		public void display() {

			System.out.println("display method called... value of  x = " + x);
			outerDisplay();
		}

	}

	public static void main(String[] args) {

		OuterDemo out = new OuterDemo();
		OuterDemo.Inner inner = out.new Inner();
		Inner.InsideInner insideInner = inner.new InsideInner();
		inner.display();

	}

}
