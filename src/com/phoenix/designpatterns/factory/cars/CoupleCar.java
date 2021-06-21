/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.factory.cars;

public class CoupleCar extends Car {
	public CoupleCar() {
		System.out.println("CoupleCar is created");
	}
		      public void start() {
			    System.out.println("CoupleCar starts...");
			    }

			  public void run() {
				// TODO Auto-generated method stub
				System.out.println("CoupleCar run..");
			    }

			  public void stop() {
		  	    System.out.println("CoupleCar stops...");
		       }
	}


