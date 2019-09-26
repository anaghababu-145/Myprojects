package bookingpackage;
import java.io.IOException;

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
	int dt[]=new int[30];
	int dtpos=0;
	Scanner sc=new Scanner(System.in);
	
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
		dt[dtpos]=date;
		dtpos++;
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
	
public void ViewBookings(int[] bk,int[] RegID) throws IOException
{
	System.out.println("view all bookings:");
	System.out.println("Enter the start date");
	startdate=sc.nextInt();
	System.out.println("Enter the end date");
	enddate=sc.nextInt();
	System.out.println("The bookings made from "+ startdate +" to "+ enddate+" are");
	System.out.println("Room No            Customer ID");
	for(int i=0;i<dtpos;i++)
	{
	if(startdate<=dt[i] && dt[i]<=enddate)
	{
		
	System.out.println(bk[i]+"             "+RegID[i]);
	}
	}
}

public void status(int[] bk,int pos,int roomChk) 
{
	
	int flag=0;
	for( int j=0;j<25;j++)
	{
		if(roomChk==bk[j])
		{
			System.out.println("Room number "+roomChk+" is booked");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("Room number "+roomChk+" is not booked");
}
public void displaycustomers(int[] RegID, String[] n, int v) {
	// TODO Auto-generated method stub
	System.out.println("The registered customers are:");
	System.out.println("Customer ID             Customer Name");
	for(int k=0;k<v;k++)
	{
		System.out.println(RegID[k]+"              "+n[k]);
	}
}

}
