import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Theater {

	public void showtime() {

		System.out.println("theater show time method called");
		
	}
	
	public Theater movieName(){
		
		System.out.println("movie name parent");
		return new Theater();
	}

}

public class Movie extends Theater {

	public void showtime() {

		super.showtime();
		System.out.println("movie show time method called");
		
	}
	
	public Movie movieName(){
		
		System.out.println("movie name child");
		return new Movie();
	}
	
	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.showtime();
		Movie m1 = m.movieName();
		
		//Scanner sc = new Scanner();
		try {
			
			
			Scanner sc = new Scanner(new File("abcd"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
