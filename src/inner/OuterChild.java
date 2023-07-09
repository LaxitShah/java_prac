package inner;

public class OuterChild extends OuterDemo {

	public static void main(String[] args) {

		OuterDemo out = new OuterDemo();
		OuterDemo.Inner inner = out.new Inner();
		inner.display();

	}
}
