/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		arr[0][0]= 3;
		arr[1][1]= 4;
		
		for(int[] array: arr) {
			for(int array2:array)
			   System.out.print(array2+" ");
			System.out.println();
		}
		int arr2[][]={{1,2,3,4},{2,3,7,8}};;
		arr2[0][0]= 8;
		arr2[1][1]= 10;
		System.out.println();
		for(int[] array: arr2) {
			for(int array2:array)
			   System.out.print(array2+" ");
			System.out.println();
		}

	}//End of main method

}//End of class ForEach2Demo
