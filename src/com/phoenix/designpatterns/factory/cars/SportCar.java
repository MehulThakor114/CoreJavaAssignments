/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory.cars;

public class SportCar extends Car {
	public SportCar() {
		System.out.println("SportCar is created");
	}
		      public void start() {
			    System.out.println("SportCar starts...");
			    }

			  public void run() {
				// TODO Auto-generated method stub
				System.out.println("SportCar run..");
			    }

			  public void stop() {
		  	    System.out.println("SportCar stops...");
		       }
}
