/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine me = new MathEngine();
		System.out.println(me.multiply(3,2));
		me.multiply(4,5,6);
		System.out.println(me.multiply(5.2f, 2));
		System.out.println(me.multiply(2,6.3f));
		

	}

}
