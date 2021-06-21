/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package day3;
  // this is a demo class for array concept
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		int arr2[]= {1,3,4,7,9};
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		String city[]= {"kalol","gandhinagar","ahmedabad","mahesana"};
		for(int i=0;i<city.length;i++) {
			System.out.print(city[i]+",");
		}
		System.out.println();
		String hobby[]= {"singing","drawing","painting"};
		for(int i=0;i<hobby.length;i++) {
			System.out.print(hobby[i]+",");
		}

	}

}
