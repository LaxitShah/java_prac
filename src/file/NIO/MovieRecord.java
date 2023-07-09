package file.NIO;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Movie1 extends MovieRecord {
		 
	public void choice() {
		 
		 	RandomAccessFile raf;
		 	
		 	try {
		 	raf = new RandomAccessFile("Pink.txt","r");
			
			raf.seek(0);
			long length = raf.length();
			byte[] bytes = new byte[(int) length];
			raf.read(bytes);
			String s1 = (new String(bytes));
			System.out.println(s1);
			
			raf.seek(64);	// total no of seats
			Total = Integer.parseInt(raf.readLine());
		//	System.out.println("Total seats in file areeeee" + Total);
			
			
			raf.seek(86);	//booked seats no
			Booked = Integer.parseInt(raf.readLine());
		//	System.out.println("Booked seats in file areeeeee" + Booked);
			
				if(Booked <= 9){
					raf.seek(106);
				}
			
				else if(Booked > 9 && Booked < 100 ) {
					raf.seek(107);
				}
			
				else {
					raf.seek(108);
					}
			
			Available = Integer.parseInt(raf.readLine());
		//	System.out.println("Available seats in file areeeee" + Available);
			raf.close();
		 	}	// try

		 	catch(Exception e) {
		 		e.printStackTrace();
		 		}//catch

	 }//end of method
		
public void ticketbook() {
	
		if(uTicket!=0 && Available >= uTicket) {
				
				Booked  = Booked + uTicket;
				Available = Total - Booked;
			//	System.out.println("Booked seats now are" + ()));
			//	System.out.println("Available Seats now are " + ());	
				invoice(150, "Pink");
				
					try {
						FileWriter fw = new FileWriter(new File("Pink.txt"));
						fw.write("Movie.1 -- Pink\n");
						fw.write("Show Timings 9:00 to 11:00 AM\n");
						fw.write("Total Seats     = 300\n");
						fw.write("Booked Seats    = "+ Booked+"\n");
						fw.write("Available Seats = " + Available);
						fw.close();
						} //try
					catch(Exception e) {
						e.printStackTrace();
						}//catch

				history();	//history update after bill generation
					
				}	//if
				
		else {
				System.out.println("Sorry...There are no seats available");
			}//else
		 
}	 //method


public void invoice(int price,String moviename) {
	
			BufferedWriter bw;
			String mnum=null;
			boolean x =true;
			
			
				System.out.println("Enter your name");
				try {
				uname1 = bfr.readLine();
				}
				catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}

				
				while(x) {
				System.out.println("Enter Your Mobile Number");
				try {
					 mnum = bfr.readLine();
					} 
				 catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
		
	
				if(mnum.length() == 10) {

						fname = ((uname1.concat(mnum)).concat(".txt"));
						try {
							bw = new BufferedWriter(new FileWriter(fname));
							bw.write("Time Cinema\n");
							bw.write("Invoice of Movie Ticket\n");
							bw.write("Name : " + uname1);
							bw.write("\nContact: " + mnum);
							bw.write("\nMovie :" + moviename);
							bw.write("\nPrice per Ticket: " + price);
							bw.write("\nTickets booked: " + uTicket);
							bw.write("\nTotal amount to be paid is " + (uTicket*price));
							bw.close();
							} //try
							
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}//catch
							System.out.println("Your tickets have been booked successfully. ");
							System.out.println("Your bill has been generated.");
							System.out.println("Thank You for using BookMyShow.");
							
							x = false;
						}//if
					
					else {
							System.out.println("Mobile number is not valid. Plz enter 10 digits.");
							x=true;
					}//else
			}//while
			
	}//method

public void history() {
		
		Path path = Paths.get(fname);
		try{
			BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
			FileTime fileTime = basicFileAttributes.creationTime();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
			String date = sdf.format(fileTime.toMillis());
			
			BufferedWriter bfw = new BufferedWriter(new FileWriter("History1.txt",true));
			bfw.write("" + uTicket + " Tickets Booked by " + uname1 +" on " + date + "\n" );
			bfw.close();
			} 		
			
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}//history method

	
}	//CLASS1

//==================================================================================================================
class Movie2 extends MovieRecord {
	 
	 public void choice1() {
		 try {
		 	RandomAccessFile raf;
		 	raf = new RandomAccessFile("Dil Bechara.txt","r");
			
			raf.seek(0);
			long length = raf.length();
			byte[] bytes = new byte[(int) length];
			raf.read(bytes);
			String s2 = (new String(bytes));
			System.out.println(s2);
			
			raf.seek(70);	// total no of seats
			Total = Integer.parseInt(raf.readLine());
		//	System.out.println("Total seats in file areeeee" + Total);
			
			
			raf.seek(92);	//booked seats no
			Booked = Integer.parseInt(raf.readLine());
		//	System.out.println("Booked seats in file areeeeee" + Booked);
			
			if(Booked <= 9)
			{
				raf.seek(112);
			}
			
			else if(Booked > 9 && Booked < 100 ) {
				raf.seek(113);
			}
			
			else {
				raf.seek(114);
				}
			
			Available = Integer.parseInt(raf.readLine());
		//	System.out.println("Available seats in file areeeee" + Available);
			raf.close();
	 }//try

		 catch(Exception e) {
		 
			 e.printStackTrace();
		 }//catch
	
}	 //method
	 
public void ticketbook1() {
		
		if( uTicket != 0 && Available >= uTicket) 
		{
			Booked  = (Booked + uTicket);
			Available = Total - Booked;
		
			//System.out.println("Booked seats now are" + Booked);
			//System.out.println("Available Seats now are " + Available);
		
			invoice1(200,"Dil Bechara");
			try {
				FileWriter fw = new FileWriter(new File("Dil Bechara.txt"));
				fw.write("Movie.2 -- Dil Bechara\n");
				fw.write("Show Timings 1:00 to 3:00 PM\n");
				fw.write("Total Seats     = 300\n");
				fw.write("Booked Seats    = "+ Booked+"\n");
				fw.write("Available Seats = " + Available);
				fw.close();
				}
			catch(Exception e) {
				e.printStackTrace();
				}
			history1();
			
		}	//if
		
		
		else {
			System.out.println("Sorry...There are no seats available");
			}
		
}//method

public void invoice1(int price,String moviename) {
	
	BufferedWriter bw;
	String mnum2=null;
	boolean y =true;
	
	System.out.println("Enter your name");
	try {
		uname1=bfr.readLine();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	while(y) {
	System.out.println("Enter Your Mobile Number");
	try {
		mnum2 = bfr.readLine();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	if(mnum2.length() ==10) {
		
		fname = ((uname1.concat(mnum2)).concat(".txt"));
		try {
			bw = new BufferedWriter(new FileWriter(fname));
			bw.write("Time Cinema\n");
			bw.write("Invoice of Movie Ticket\n");
			bw.write("Name : " + uname1);
			bw.write("\nContact: " + mnum2);
			bw.write("\nMovie :" + moviename);
			bw.write("\nPrice per Ticket: " + price);
			bw.write("\nTickets booked: " + uTicket);
			bw.write("\nTotal amount to be paid is " + (uTicket*price));
			bw.close();
		} //try
	 
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}//catch	
		System.out.println("Your tickets have been booked successfully. ");
		System.out.println("Your bill has been generated.");
		System.out.println("Thank You for using BookMyShow.");
			y = false;
		}//if
	
		else {
			System.out.println("Mobile number is not valid Plz enter 10 digits.");
			y=true;
		}//else
	}//while
	
}//method


public void history1() {
	
	Path path = Paths.get(fname);
	try{
		BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime fileTime = basicFileAttributes.creationTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		String date = sdf.format(fileTime.toMillis());
		
		BufferedWriter bfw = new BufferedWriter(new FileWriter("History2.txt",true));
		bfw.write("" + uTicket + " Tickets Booked by " + uname1 +" on " + date + "\n");
		bfw.close();
		} 		
		
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}//history method


}//class2


 
public class MovieRecord{	 
	
	public static int uTicket,Total,Booked,Available;
	
	static Scanner sc = new Scanner (System.in);
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	String uname1=null;
	String fname=null;
	
public static void main (String[] args) {
		
		String m1 = "Pink";
		String m2 = "Dil Bechara";
		int Price1=150;
		int Price2=200;
		
		Movie1 movie1 = new Movie1();
		Movie2 movie2 = new Movie2();
	
//*************************************************************************************************			
		
		 	System.out.println("Movies Available....\nPink\nDil Bechara\n");
			System.out.println("Press 1 to book tickets for Pink");
			System.out.println("Ticket Price for Pink is "+ Price1 + " Rs.\n");
			System.out.println("Press 2 to book tickets for Dil Bechara");
			System.out.println("Ticket Price for Pink is "+ Price2 + " Rs.\n");
			System.out.println("Press 3 for exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
				{
					File f1 = new File("Pink.txt");
						if(f1.exists()) {
						}//if
						else {
							try {
								f1.createNewFile();
								BufferedWriter bfw = new BufferedWriter(new FileWriter(f1));
								bfw.write("Movie.1 -- Pink\n");
								bfw.write("Show Timings 9:00 to 11:00 AM\n");
								bfw.write("Total Seats     = 300\n");
								bfw.write("Booked Seats    = 0\n");
								bfw.write("Available Seats = 300");
								bfw.close();
								}
						catch(Exception e) {
							e.printStackTrace();
							}
					
						}//else
						System.out.println("You have selected " + m1);
						System.out.println("------------------------------------------------------------------------------------------------------------------");	
						movie1.choice();
						System.out.println("Enter the number of tickets you want to book");
						uTicket = sc.nextInt();
						movie1.ticketbook();
				break;
				} //case 1
			
				case 2: 
				{
					File f1 = new File("Dil Bechara.txt");
					if(f1.exists()) {
								}
					else {
						try {
							f1.createNewFile();
							BufferedWriter bfw = new BufferedWriter(new FileWriter(f1));
							bfw.write("Movie.2 -- Dil Bechara\n");
							bfw.write("Show Timings 1:00 to 3:00 PM\n");
							bfw.write("Total Seats     = 300\n");
							bfw.write("Booked Seats    = 0\n");
							bfw.write("Available Seats = 300\n");
							bfw.close();
							}
											
						catch(Exception e) {
							e.printStackTrace();
							}
							}//else
					
						System.out.println("You have selected "+ m2);
						System.out.println("------------------------------------------------------------------------------------------------------------------");	
						movie2.choice1();
						System.out.println("Enter the number of tickets you want to book");
						uTicket = sc.nextInt();
						movie2.ticketbook1();	
						break;
						} //case 2
				
				case 3:{
					System.exit(1);
				}
			}//switch
	}//main
}// main class
