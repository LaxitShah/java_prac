package Boxing;

public class BoxigDEmo {

	public String getParam() {

		return "false";
	}

	public static void main(String[] args) {

		BoxigDEmo b1 = new BoxigDEmo();
		// int age = Integer.parseInt(b1.getParam());
		// String age = b1.getParam();
		boolean b = Boolean.parseBoolean(b1.getParam());
		// System.out.println(age + 12);
		System.out.println(b);

	}
}
