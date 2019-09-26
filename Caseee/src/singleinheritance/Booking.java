package singleinheritance;

public class Booking 
{
public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
int persons;
int total_Days;
double tariff;
String roomType;
double total;
public double roomBooking(int persons,int total_Days,double tariff,String roomType)
{
	total=persons*total_Days*tariff;
	return total;
}
}
 class SeasonBooking extends Booking
 {
	 public double roomBooking(int persons,int total_Days,double tariff,String roomType)
	 {
	    return super.roomBooking(persons, total_Days, tariff, roomType);
	 }
 }
 class PeakSeason extends Booking
 {
	 int month;
	 public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	int peakCharges;
	 public double roomBooking(int persons,int total_Days,double tariff,String roomType,int month,int peakCharges)
	 {
		 setMonth(month);
		 setPeakCharges(peakCharges);
		return super.roomBooking(persons, total_Days, tariff, roomType)*peakCharges;
		 
	 }
 }

class LeanSeason extends Booking
{
	int month;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	int discount;
	double dis;
	public double roomBooking(int persons, int total_Days, double tariff, String roomType ,int discount)
	{
		setMonth(month);
		setDiscount(discount);
		dis=(persons*total_Days*tariff)*discount/100;
		return super.roomBooking(persons, total_Days, tariff, roomType)-dis;
		
	}
}