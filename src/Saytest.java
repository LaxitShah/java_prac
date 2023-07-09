
interface Sayable {

	public String say(String msg, int a);

}

interface Sayable1 {

	public String say(String msg, int a);

}

public class Saytest {

	public static void main(String[] args) {

		Sayable s = (msg, a) -> {

			System.out.println("value of a" + a);

			return msg.concat("-hello");
		};

		Sayable1 s1 = (msg, a) -> {

			System.out.println("value of a" + a);

			return msg.concat("-hello");
		};

		String msg = s.say("hi", 100);
		System.out.println(msg);

	}
}
