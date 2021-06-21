/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class MyDateP {
	//data members
		private int day;
		private int month;
		private int year;
      MyDateP(){
    	 day=9;
    	 month=6;
    	 year=2021;
      }
      MyDateP(int a,int b,int c){
    	  day=a;
     	  month=b;
     	  year=c;
      }
      public void printDate(){
    	  System.out.println("Date: "+day+"/"+month+"/"+year);
      }
}
