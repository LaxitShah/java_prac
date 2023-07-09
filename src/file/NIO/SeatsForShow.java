package file.NIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


public class SeatsForShow 
{
	public static void main(String[] args) throws FileNotFoundException  
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------Welcome to SeatsForShow--------------------");
		System.out.println("\n1 --- Dil Bechara");
		System.out.println("2 --- Angezi Medium");
		System.out.println("3 --- Avengers Endgame");
		System.out.println("4 --- View History");
			
		System.out.println("\nWhich movie do you wanna saw press according number : ");
		int mch = sc.nextInt();
		
		switch(mch)
		{
		case 1 :
			System.out.println(" --- You chose Dil Bechara Movie --- \n");
			System.out.println("Show timings : ");
			System.out.println("\n1 ----- 1:00 ***** 120rs");
			System.out.println("2 ----- 3:30 ***** 100rs");
			System.out.println("Choose timing : ");
			int tch1 = sc.nextInt();
			
			
			if(tch1 == 1)
			{
				//System.out.println("Total Available Seats : ");
				File filetext1 = new File("available.txt");
				
				Scanner s = new Scanner(filetext1);
				int av1 = s.nextInt();
			//	System.out.println(av1);
				
				System.out.println("\nTotal Available Seats are : "  + av1 + " Hurry up!!!");
				System.out.println("\nHow many tickets do wanna book???");
				int tb2 = sc.nextInt();
			
				
				if(tb2>av1)
				{
					System.out.println("Booking Failed!!! .......... There are only " + av1 + " seats available");
				}
				else 
				{
					System.out.println("Please enter your name : ");
					String name= sc.next();
					System.out.println("\nBooking Successfully....");
					System.out.println("\nYour bill amount is : " + tb2*120);	
					
					try 
					{
						BufferedWriter br2 = new BufferedWriter(new FileWriter("history.txt", true));
						SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
						Date date = new Date();
						br2.write("\nName : " + name);
						br2.write("\nTime  : " + sdf2.format(date));
						br2.write("\nMovie Name : Dil Bechara");
						br2.write("Show Timing : 1:00pm");
						br2.write("\nTotal number of tickets : " + tb2);
						br2.write("\nTotal Amount : " + tb2*120);
						br2.write("\n********************************************************/n/n");
						br2.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					
					try 
					{
						FileWriter fw1 = new FileWriter("available.txt");
						
						fw1.write(new Integer(av1-tb2).toString());
						//System.out.println("Created");
						fw1.close();
					} 
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}//end if

/********************************************************************************************************************************************************************/
			
			if(tch1 == 2)
			{
				System.out.println("Total Available Seats : ");
				File filetext = new File("avail.txt");
				
				Scanner s = new Scanner(filetext);
				int av = s.nextInt();
				//System.out.println(av);
				
				System.out.println("Total Available Seats are : "  + av + " Hurry up!!!");
				System.out.println("\nHow many tickets do wanna book???");
				int tb1 = sc.nextInt();

				
				if(tb1>av)
				{
					System.out.println("Booking Failed!!! " + " only " +av + " seats are available");
				}
				else 
				{
					System.out.println("Please enter your name : ");
					String name1= sc.next();
					System.out.println("Booking Successfully....");
					System.out.println("Your bill amount is : " + tb1*100);
				
				try 
				{
					BufferedWriter br1 = new BufferedWriter(new FileWriter("history.txt", true));
					SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
					Date date = new Date();
					br1.write("\n\nName : " + name1);
					br1.write("\nTime  : " + sdf1.format(date));
					br1.write("\nMovie Name : Dil Bechara");
					br1.write("Show Timing : 3:30pm");
					br1.write("\nTotal number of tickets : " + tb1);
					br1.write("\nTotal Amount : " + tb1*100);
					br1.write("\n********************************************************");
					br1.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					FileWriter fw = new FileWriter("avail.txt");
					
					fw.write(new Integer(av-tb1).toString());
					//System.out.println("Created");
					fw.close();
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
			
				}//end nested else
				
				
			} // end if
			
			break;
			
/*==================================================================================================*/
			
	/*		
		case 2 : 
			
		
			System.out.println(" --- You chose Angrezi Medium --- \n");
			System.out.println("Show timings : ");
			System.out.println("\n1 ----- 10:00 ***** 100rs");
			//System.out.println("2 ----- 5:30 ***** 1020rs");
			System.out.println("Choose timing : ");
			int tch2 = sc.nextInt();
			
			
			if(tch2 == 1)
			{
				//System.out.println("Total Available Seats : ");
				File file1 = new File("avam1.txt");
				
				Scanner s = new Scanner(file1);
				int am1 = s.nextInt();
			//	System.out.println(av1);
				
				System.out.println("\nTotal Available Seats are : "  + am1 + " Hurry up!!!");
				System.out.println("\nHow many tickets do wanna book???");
				int s1 = sc.nextInt();
			
				
				if(s1>am1)
				{
					System.out.println("Booking Failed!!! .......... There are only " + am1 + " seats available");
				}
				else 
				{
					System.out.println("Please enter your name : ");
					String name= sc.next();
					System.out.println("\nBooking Successfully....");
					System.out.println("\nYour bill amount is : " + s1*100);	
					
					try 
					{
						BufferedWriter br2 = new BufferedWriter(new FileWriter("history.txt", true));
						SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
						Date date = new Date();
						br2.write("\nName : " + name);
						br2.write("\nTime  : " + sdf2.format(date));
						br2.write("\nMovie Name : Dil Bechara");
						br2.write("Show Timing : 1:00pm");
						br2.write("\nTotal number of tickets : " + s1);
						br2.write("\nTotal Amount : " + s1*110);
						br2.write("\n********************************************************");
						br2.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					
					try 
					{
						FileWriter fw1 = new FileWriter("available.txt");
						
						fw1.write(new Integer(sm1-).toString());
						//System.out.println("Created");
						fw1.close();
					} 
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}//end if
			break;
			*/
			
/*=====================================================================================================*/
			
		case 4 : 
			try 
			{
				BufferedReader bill = new BufferedReader(new FileReader("history.txt"));
				String billdetail1;

				while ((billdetail1 = bill.readLine()) != null) 
				{
					System.out.println(billdetail1);
				}
				bill.close();

			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}//end switch
		sc.close();
	}//end main
}
