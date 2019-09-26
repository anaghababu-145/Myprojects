package singleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int persons;
		int total_Days;
		double tariff;
		String roomType;
		int month;
		int discount;
		int pcharge;
		Booking book=new Booking();
		PeakSeason pk=new PeakSeason();
		LeanSeason ln=new LeanSeason();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Booking");
	System.out.println("Enter the number of persons");
	persons=Integer.parseInt(br.readLine());
	System.out.println("Enter the number of days");
	total_Days=Integer.parseInt(br.readLine());
	System.out.println("Enter the room type");
	roomType=br.readLine();
	System.out.println("Enter the month");
	month=Integer.parseInt(br.readLine());
	if(month==1||month==2||month==3||month==7||month==8||month==9||month==10)
	{
	System.out.println("Enter the discount");
	discount=Integer.parseInt(br.readLine());
	System.out.println("Enter the tariff for single person");
	tariff=Double.parseDouble(br.readLine());
	System.out.println("Total tariff : "+ln.roomBooking(persons, total_Days, tariff, roomType, discount));
	}
	else
		System.out.println("Enter the peak charge ");
	pcharge=Integer.parseInt(br.readLine());
	System.out.println("Enter the tariff for single person");
	tariff=Double.parseDouble(br.readLine());
	System.out.println("Total tariff : "+pk.roomBooking(persons, total_Days, tariff, roomType, month, pcharge));
	}
	

}
