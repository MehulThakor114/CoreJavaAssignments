/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class MyDateC {
	//data members
		private int day;
		private int month;
		private int year;
		//member method
		/* InitDate() method is used to initialize data members*/
		public MyDateC() {
			day=9;
			month=6;
			year=2021;
		}
		public void printDate() {
			System.out.println("Date: "+day+"/"+month+"/"+year);
		}
}
