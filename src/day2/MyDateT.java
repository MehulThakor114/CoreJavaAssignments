/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class MyDateT {
	//data members
			private int day;
			private int month;
			private int year;
			MyDateT(){
				this(10,6,2021);
			}
			MyDateT(int day,int month,int year){
				this.day=day;
				this.month=month;
				this.year=year;
			}
			public void printDate(){
		    	  System.out.println("Date: "+day+"/"+month+"/"+year);
		      }
}
