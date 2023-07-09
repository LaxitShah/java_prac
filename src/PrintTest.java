interface Printable {

	public String print(String name);
}

public class PrintTest {

	public void demo() {

		Printable p = (name) -> {

			return name;
		};
		String name = p.print("sam");
		System.out.println("print "+ name);
	}
	

	public static void main(String[] args) {

		
		PrintTest p = new PrintTest();
		p.demo();
				
	}
}
