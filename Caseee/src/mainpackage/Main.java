package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import bookingpackage.Booking;
import customerpackage.Customer;
import registration.Registration;

public class Main {
	public static int[] bk=new int[25];
	public static int roomid=0;
	public static int   registerID=0;
	public static int[] RegID=new int[25];

	public static void main(String[] args) throws IOException 
	{
		int pos=0;
		Scanner sc=new Scanner(System.in);
		
		 String firstName;
		 String middleName;
		 String lastName;
		 String email;
		 String phone;
		 String address;
		 String proofType,ch;
		 String proofId;
		 Booking book=new Booking();
		 String n[]=new String[30];
		 String emailid[]=new String[30];
			int v=0;
			int emid = 0;
			String em;
			Customer customer=new Customer();
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 do {
		 System.out.println("\t   Menu");
		 System.out.println("\t-----------");
				 System.out.println("1.Registration\n2.Booking\n3.Check status\n4.Email\n5.All bookings\n6.All customers\n7.Exit");
		 System.out.println("Choose your option:");
				 int choice=Integer.parseInt(br.readLine());
		 
		 String ch1;
		 switch(choice)
		 {
		 case 1:
			 do
			 {
			 System.out.println("****Welcome to registration****");
			 System.out.println("Please enter your details");
			 System.out.println("Enter your name : ");
		     firstName=br.readLine();
		     n[v]=firstName;
		     v++;
		     System.out.println("Enter your middle name :");
		     middleName=br.readLine();
		     System.out.println("Enter your last name :");
		     lastName=br.readLine();
		     System.out.println("Enter your email:");
		     email=br.readLine();
		     emailid[emid]=email;
		     System.out.println("Enter your phone number:");
		     phone=br.readLine();
		     System.out.println("Enter your address:");
		     address=br.readLine();
		     System.out.println("Enter your proof type:");
		     proofType=br.readLine();
		     System.out.println("Enter your proof id:");
		     proofId=br.readLine();
		     
		     Registration reg=new Registration();
		     reg.register(firstName,middleName,lastName,email,phone,address,proofType,proofId);
		     System.out.println("Thanks for registering.Your ID is : "+ ++registerID);
		     RegID[emid]=registerID;
		     emid++;
		     System.out.println("Do you want to go back to Registration(y/n)?");
			 ch1=br.readLine();
			 }while(ch1.equalsIgnoreCase("y"));
		     break;
		 case 2:
			 String ch2;
			 book.booking();//booking room		 
			 book.booked();//details of room
			 System.out.println("Do you want to Proceed(y/n)?");
			 ch2=br.readLine();
			 if(ch2.equalsIgnoreCase("y"))
			 {
				 System.out.println("Thank you for the booking.Your RoomID is :"+ ++roomid);
				 bk[pos++]=roomid;		 
			 }
			 else
				 System.out.println("Visit Again");
			 break;
		 case 3:
			 System.out.println("Enter the room no you want to check?");
			 int roomChk=sc.nextInt();
			 book.status(bk,pos,roomChk);//
			 break;
		 case 4:
			 //email updation;
			 System.out.println("Do you want to update the email id(y/n)?");
				em=br.readLine();
				if(em.equalsIgnoreCase("y"))
				{
					System.out.println("Enter Customer ID : ");
					int custid=sc.nextInt();
					
					System.out.println("Enter new email id");
					String nemail=br.readLine();
				 customer.updateEmail(custid,nemail,emailid,emid);
				 System.out.println("Email updated");
					
				}
			 break;
		 case 5:
			 //all bookings
			 book.ViewBookings(bk,RegID);
			 break;
		 case 6:
			// all customers
			 book.displaycustomers(RegID,n,v);
			 break;
		 case 7:
			 //quit
			 System.out.println("****Thank you****");
			 System.exit(0);
			 
			 break;
		 }
		 System.out.println("Do you want to go back to main menu(y/n)");
		 ch=br.readLine();
		 }while(ch.equalsIgnoreCase("y"));
		 
	}}


