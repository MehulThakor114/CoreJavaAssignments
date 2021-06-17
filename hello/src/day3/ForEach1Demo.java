/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day3;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]=new double[5];
		for(double i : arr) {
			System.out.println(i);
		}
		System.out.println();
		float arr2[]=new float[5];
		for(float i : arr2) {
			System.out.println(i);
		}
		System.out.println();
		String arr3[]= {"rose","lotus"};
		for(String i : arr3) {
			System.out.println(i);
		}
		System.out.println();
		String arr4[]= {"India","USA","russia"};
		for(String i : arr4) {
			System.out.println(i);
		}

	}

}
