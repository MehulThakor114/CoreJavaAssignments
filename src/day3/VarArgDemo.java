/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;

public class VarArgDemo {
	public static double average(int...a) {
		double avg=0.0;
		for(int i=0;i<a.length;i++)
			avg=avg+a[i]; 

		avg=avg/a.length;
		return avg;
	
	}

	public static void main(String[] args) {
		System.out.println(average(5,6));

	}//End of Main method

}//End of class VarArgDemo
