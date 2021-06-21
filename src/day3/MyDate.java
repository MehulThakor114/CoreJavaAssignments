/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 8-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;
//This is MyDate class representing date entity
public class MyDate {
	//data members
	private int day;
	private int month;
	private int year;
	//member method
	/* InitDate() method is used to initialize data members*/
	public void initDate(int a,int b,int c) {
		day=a;
		month=b;
		year=c;
	}
	public void printDate() {
		System.out.println("Entered date is "+day+"/"+month+"/"+year);
	}
	 public String toString(){
		    return "Date: "+this.day+"/"+this.month+"/"+this.year;
		  }
} // End of class Mydate
