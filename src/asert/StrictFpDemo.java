package asert;

//IEEE754 floating point calculations std
public strictfp class StrictFpDemo {

	public strictfp void add() {

		double no1 = 10.0 + 10;
		double no2 = 20.0 + 10;
		System.out.println(no1 + no2);
	}

	public strictfp static void main(String[] args) {

		StrictFpDemo s1 = new StrictFpDemo();
		s1.add();
	}
}
