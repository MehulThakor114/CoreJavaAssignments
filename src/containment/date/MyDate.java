/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:2.0
*  Copyright: Sterlite Technologies Ltd.
*/
package containment.date;
//This is MyDate class representing date entity
public class MyDate {
	//data members
		private int day;
		private int month;
		private int year;
		//default constructor
		public MyDate(){
			day=19;
			month=06;
			year=1999;
		}
		//parameterized constructor
		public MyDate(int day,int month, int year){
		    this.day=day;
			this.month=month;
			this.year=year;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public void printDate() {
			System.out.println("Entered date is "+day+"/"+month+"/"+year);
		}
		 public String toString(){
			    return "Date: "+this.day+"/"+this.month+"/"+this.year;
			  }
}
