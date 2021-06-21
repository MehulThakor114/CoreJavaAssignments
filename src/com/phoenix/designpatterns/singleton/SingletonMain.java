/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sun obj = Sun.getInstance();// sun obj
		obj.giveLight();//method called
		
		Earth earth = Earth.getInstance();// Earth obj
		earth.createLife();//method called
		
		PrimeMinister prime = PrimeMinister.getInstance();// prime obj
		prime.serveNation();//method called

		President president = President.getInstance();// president obj
		president.representNation();//method called

		System.out.println();
		Sun obj2 = Sun.getInstance();
		
	}

}
		
		
		
		
		
		
		
	
