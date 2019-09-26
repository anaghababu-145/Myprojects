package bookingpackage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import customerpackage.Customer;
public class Booking {

	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int date ;
	int charge;
	
	int startdate;
	int enddate;
	static int i=0;
	// int roomid=0;
	//int bk[]=new int[25];
	//int dt[]=new int[30];
	int dtpos=0;
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> dt=new ArrayList<Integer>();
	
	public void booking()
	{
		System.out.println("Booking:");
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=sc.nextLine();
		System.out.println("Cot(Single/Double)");
		cot=sc.nextLine();
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=sc.nextLine();
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=sc.nextLine();
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=sc.nextLine();
		System.out.println("Date");
		date=sc.nextInt();
		dt.add(date);
		//dt[dtpos]=date;
		//dtpos++;
	}
	public void booked()
	{
		charge = 0;
		if(this.ac.equalsIgnoreCase("AC"))
			charge+=1000;
		else
			charge+=750;
		if(this.cot.equalsIgnoreCase("Single"))
			charge+=0;
		else
			charge+=350;
		if(this.cable.equalsIgnoreCase("C"))
			charge+=50;
		else
			charge+=0;
		if(this.wifi.equalsIgnoreCase("W"))
			charge+=200;
		else
			charge=+0;
		if(this.laundry.equalsIgnoreCase("L"))
			charge+=100;
		else
			charge+=0;

		System.out.println("The total charge is Rs"+charge);
		System.out.println("The services chosen are");
		if(this.cot.equalsIgnoreCase("Single")) System.out.println("Single cot");
		else System.out.println("Double cot");
		if(this.ac.equalsIgnoreCase("AC"))
			System.out.println("AC room");
		else System.out.println("non-AC room");
		if(this.cable.equalsIgnoreCase("C"))
			System.out.println("Cable connection enabled");
		else System.out.println("Cable connection disabled");
		if(this.wifi.equalsIgnoreCase("W"))
			System.out.println("Wifi enabled");
		else
			System.out.println("Wifi disabled");
		if(this.laundry.equalsIgnoreCase("L"))
			System.out.println("with laundry services");
		else System.out.println("without laundry services");
		
	}
	
public void ViewBookings(ArrayList<Integer> rd,ArrayList<Integer> rg) throws IOException
{
	System.out.println("view all bookings:");
	System.out.println("Enter the start date");
	startdate=sc.nextInt();
	System.out.println("Enter the end date");
	enddate=sc.nextInt();
	System.out.println("The bookings made from "+ startdate +" to "+ enddate+" are");
	System.out.println("Room No            Customer ID");
	for(int i=0;i<dt.size();i++)
	{
	if(startdate<=dt.get(i) && dt.get(i)<=enddate)
	{
		
	System.out.println(rd.get(i)+"             "+rg.get(i));
	}
	}
}

public void displaycustomers(ArrayList<Integer> rg, ArrayList<String> name) {
	// TODO Auto-generated method stub
	System.out.println("The registered customers are:");
	System.out.println("Customer ID             Customer Name");
	for(int k=0;k<name.size();k++)
	{
		System.out.println(rg.get(k)+"              "+name.get(k));
	}
}
public void status(ArrayList<Integer> rd, int roomChk) 
{
	// TODO Auto-generated method stub
	int flag=0;
	for( int j=0;j<25;j++)
	{
		if(roomChk==rd.get(j))
		{
			System.out.println("Room number "+roomChk+" is booked");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("Room number "+roomChk+" is not booked");
	
}

}
