/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class DateMainSG {

	public static void main(String[] args) {
		MyDateSG obj = new MyDateSG();
		obj.setDay(15);
		obj.setMonth(6);
		obj.setYear(2021);
		System.out.print(obj.getDay());
		System.out.print("/");
		System.out.print(obj.getMonth());
		System.out.print("/");
		System.out.print(obj.getYear());
		
		MyDateSG obj2 = new MyDateSG(16,6,2021);
		System.out.println();
		System.out.print(obj2.getDay());
		System.out.print("/");
		System.out.print(obj2.getMonth());
		System.out.print("/");
		System.out.print(obj2.getYear());

	}

}
