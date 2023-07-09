package doubts;

class ClassOne {

	void method(String s1) {
		method(s1, s1 + s1);
	}

	void method(String s1, String s2) {
		//s1 = java ,s2 =javajava
		
		method(s1, s2, s1 + s2);
	}

	void method(String s1, String s2, String s3) {
		System.out.println(s1 + s2 + s3);
		//javajavajavajavajavajava
	}

}
//enum -->final keyword
public class MainClass {

	public static void main(String[] args) {

		ClassOne one = new ClassOne();

		
		new ClassOne().method("java");
		one.method("JAVA");
	}
}