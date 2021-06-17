/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 8-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;

import java.util.Scanner;
//This is Main class used to deal with MyDate
public class DateMain {
  // This is main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
// creating object of MyDate class
		MyDate date =new MyDate();
		date.initDate(d,m,y);
		date.printDate();

	}//End of main method

}// End of class DateMain
