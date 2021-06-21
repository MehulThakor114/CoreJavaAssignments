/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		arr[0][0]= 2;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			System.out.println(arr[i][j]);
		}
		System.out.println();
		int arr2[][]= {{1,2,3,4},{2,3,7,8}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++)
			     System.out.print(arr2[i][j]+" ");
			System.out.println();
		}

	}

}
