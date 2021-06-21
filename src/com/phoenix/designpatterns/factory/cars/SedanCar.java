/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory.cars;

public class SedanCar extends Car {
	public SedanCar() {
		System.out.println("SedanCar is created");
	}
		      public void start() {
			    System.out.println("SedanCar starts...");
			    }

			  public void run() {
				// TODO Auto-generated method stub
				System.out.println("SedanCar run..");
			    }

			  public void stop() {
		  	    System.out.println("SedanCar stops...");
		       }


}
