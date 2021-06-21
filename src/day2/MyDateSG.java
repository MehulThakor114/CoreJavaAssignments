/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class MyDateSG {
	       //data members
			private int day;
			private int month;
			private int year;
			
			MyDateSG(){
				System.out.println("default constructor");
			}
			MyDateSG(int day,int month,int year){
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
			
			public void printDate(){
		    	  System.out.println("Date: "+day+"/"+month+"/"+year);
		      }
}
