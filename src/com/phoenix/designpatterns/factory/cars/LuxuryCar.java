/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory.cars;

public class LuxuryCar extends Car {
	public LuxuryCar() {
		System.out.println("LuxuryCar is created");
	}
		      public void start() {
			    System.out.println("LuxuryCar starts...");
			    }

			  public void run() {
				// TODO Auto-generated method stub
				System.out.println("LuxuryCar run..");
			    }

			  public void stop() {
		  	    System.out.println("LuxuryCar stops...");
		       }
}
