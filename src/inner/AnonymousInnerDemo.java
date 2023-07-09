package inner;

abstract class Employee {

	abstract void data();
}

interface Studennt {

	void result();
}

public class AnonymousInnerDemo {

	public static void main(String[] args) {

		//
		Employee emp = new Employee() {

			void data() {

				System.out.println("data method called...");

			}

		};
		emp.data();

		Studennt s = new Studennt() {

			@Override
			public void result() {

				System.out.println("result called..");

			}
		};
		s.result();

	}

}
