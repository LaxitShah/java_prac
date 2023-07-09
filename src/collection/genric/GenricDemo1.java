package collection.genric;

//E elements
//T type
//K key
//V value
class Class{
	
	
}

public class GenricDemo1<T> {

	public void add(T a) {

		System.out.println(a);
	}

	public boolean contains(T a) {

		return false;
	}

	public static void main(String[] args) {

		//GenricDemo1<String> obj = new GenricDemo1<>();
		GenricDemo1<Integer> obj1 = new GenricDemo1<>();
		GenricDemo1<Double> obj2 = new GenricDemo1<>();
		//GenricDemo1<Boolean> obj2 = new GenricDemo1<>();
		//obj.add("samir");
		
		GenricDemo1<Class> c = new GenricDemo1<>();
		
	}
}
