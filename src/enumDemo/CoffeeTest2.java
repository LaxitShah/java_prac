package enumDemo;

import enumDemo.Coffee2.CoffeeSize;

class Coffee2 {
	
	enum CoffeeSize {

		BIG, HUGE, OVER;
	}
	

	CoffeeSize size;
}

public class CoffeeTest2 {

	public static void main(String[] args) {

		Coffee2 drink = new Coffee2();
		drink.size  = Coffee2.CoffeeSize.BIG;//CoffeeZise
		System.out.println(drink.size);
		
	}
}
