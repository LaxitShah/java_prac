package file.NIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class Movie_Application{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Movie Ticket Booking System");
		System.out.println("");
		
		String st,str;
		int num = 0,ticket,count=1;
		char c;
	
		
		System.out.println("Select Any Movie:- ");
		System.out.println("1....Shutter Island");
		int choice=sc.nextInt();
		
		switch (choice) {
			case 1:
					System.out.println("You have selected Intersteller movie");
					System.out.println("The price of the movie is 500 rs");
					
					System.out.println("Enter the no. of tickets you want to buy:-");
					ticket=sc.nextInt();
					
					try 
					{
						BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\javapro\\samir_sir_prac\\new\\src\\HW\\test.txt"));
						while((st=reader.readLine())!=null)
						{
							num=Integer.parseInt(st);
							num-=ticket;
							if(num>0)
							{
							System.out.println("Total available seats are:-"+num);
							System.out.println("the total amount is:"+(ticket*500));
							}
							else {
								System.out.println("no ticket available");
							}
						}
						reader.close();
						
						
						BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\javapro\\samir_sir_prac\\new\\src\\HW\\test.txt"));
						str=Integer.toString(num);
						writer.write(str);
						writer.close();
					
						FileWriter hist=new FileWriter("C:\\Users\\Admin\\Desktop\\javapro\\samir_sir_prac\\new\\src\\HW\\history.txt",true);
						
						hist.write("print:-\n"+count);
						hist.write("total seats selected are:-\n"+ticket);
						hist.write("price of the tickets are:-\n"+(ticket*500));
						count++;	
						hist.close();
					} 
					
					catch (IOException e)
					{
						// TODO: handle exception
						e.printStackTrace();
					}
					
					
	
					break;
			default:
				System.out.println("You have selected an invalid option.");
				break;
			
		}//end of switch case
		
		
		
		
		
		
	}
}

