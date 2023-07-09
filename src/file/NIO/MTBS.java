package file.NIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MTBS {
	public static void main(String args[]) throws IOException
	{
		int price=300;
		int totalprice=0;
		int raazitotalseats=25,raaziseatsbooked=0,raaziseatsleft=25,raazibookseats;
		String mname="Raazi";
		String check="";
		boolean ans;
		String check1="Sorry we are booked! Thank you for visiting!";
		Scanner sc=new Scanner(System.in);
		while(true)
		{
	        System.out.println("\nWelcome to Maxus Cinema");
	        System.out.println("=============================================");
			System.out.println("Movie Name:"+mname);
			System.out.println("Price:"+price);
			System.out.println("=============================================");
			System.out.println("1.Book Tickets");
			System.out.println("2.View Receipt");
			System.out.println("3.View History");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					try 
					{
						if(raaziseatsleft==0)
						{
							System.out.println();
							System.out.println("=============================================");
							System.out.println("Sorry we are booked! Thank you for visiting!");
							System.out.println("=============================================");
							FileWriter fw1 = new FileWriter("raazi.txt");
					        fw1.write("Sorry we are booked! Thank you for visiting!");
					        fw1.close();
							break;
						}
						FileReader reader2 = new FileReader("raazi.txt");
						int c2 = 0;
						while ((c2 = reader2.read()) != -1) 
						{
							System.out.print((char) c2);
							check=check+(char)c2;
						}
						ans=check.equals(check1);
						if(ans==true)
						{
							System.exit(0);
						}
						reader2.close();
						System.out.print("\nHow many seats you want to book?");
						raazibookseats=sc.nextInt();
						if(raazibookseats>raaziseatsleft)
						{
							System.out.println("Please enter the correct value.Not Enought Seats");
							break;
						}
						raaziseatsbooked=raaziseatsbooked+raazibookseats;
						raaziseatsleft=raazitotalseats-raaziseatsbooked;
						File file = new File("raazi.txt"); 
						try 
						{
							if (file.exists()) 
							{	
								BufferedWriter writer1 = Files.newBufferedWriter(Paths.get("raazi.txt"));
								writer1.write("");
								writer1.flush();
								writer1.close();
								FileWriter fw1 = new FileWriter("raazi.txt", true);
						        fw1.write("\nTotal Seats:"+raazitotalseats);
						        fw1.write("\nNo. of seats booked:"+raaziseatsbooked);
						        fw1.write("\nNo. of seats remaining:"+raaziseatsleft);
						        fw1.write("\nPrice:"+price);
							    fw1.close();	
							} 
							else 
							{
								System.out.println("file doest no exists");
							}
						} 
						catch(IOException e)
						{
							e.printStackTrace();
						}
						totalprice=raazibookseats*price;
						System.out.println("Total price:"+(totalprice));
						System.out.println("Booking Completed Successfully!!");
						System.out.println("Thank you for visiting");
						FileWriter fw;
						try
						{
							fw=new FileWriter("receipt.txt");
							BufferedWriter br = new BufferedWriter(fw);
							br.write("\nMovie Name:Raazi");
							br.write("\nNo.of seats booked:"+raazibookseats);
							br.write("\nTotal price:"+(raazibookseats*price));
							br.write("\nTimings:3 P.M. to 6 P.M.");
							br.write("\nThank you for visiting");
							br.close();
							fw.close();
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
						BufferedWriter br = new BufferedWriter(new FileWriter("history.txt", true));
						br.write("\nMovie Name:Raazi");
						br.write("\nNo.of seats booked:"+raazibookseats);
						br.write("\nTotal price:"+(raazibookseats*price));
						br.write("\nTimings:3 P.M. to 6 P.M.");
						br.write("\nThank you for visiting");
						br.close();
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}	
					break;
				case 2:
					try 
					{
						FileReader reader2 = new FileReader("receipt.txt");
						int c2 = 0;
						while ((c2 = reader2.read()) != -1) 
						{
							System.out.print((char) c2);
						}
						reader2.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					break;
				case 3:
					try 
					{
						FileReader reader3 = new FileReader("history.txt");
						int c3 = 0;
						while ((c3 = reader3.read()) != -1) 
						{
							System.out.print((char) c3);
						}
						reader3.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					break;
			case 4:
				System.exit(0);
			}//switch
		}//while
	}//main
}//class
