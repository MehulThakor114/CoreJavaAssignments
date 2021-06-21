/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;

public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate[] array = new MyDate[2];
		array[0]= new MyDate();
         System.out.println(array[0]);
         
         MyDate obj1 = new MyDate();
         MyDate obj2 = new MyDate();
         System.out.println();
        MyDate[] array2 = {obj1,obj2 };
        for(MyDate date:array2) {
        	System.out.println(date);
        }
	}
}
