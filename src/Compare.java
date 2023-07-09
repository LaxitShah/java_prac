import java.util.Random;
import java.util.Scanner;

public class Compare {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Please Enter your Email: ");
		String eMail = sc.next();
	
		String num = String.format("%04d%n",r.nextInt(10000));
		String pwd1 = (eMail.split("@")[0]).concat("_").concat(num);
		pwd1 = pwd1.trim();
		System.out.println(pwd1);
		//send(eMail,"This is Password verification email.",pwd1);
	
		
		System.out.print("Please enter the password you received: ");
		String password = sc.next();
		
	
		System.out.println(password.equals(pwd1));
		
		if(password.equals(pwd1)) 
		{
			System.out.println("****Login Successful****");
		}
		else {
			System.out.println("Login failed");
		}
	
	}

}

	

