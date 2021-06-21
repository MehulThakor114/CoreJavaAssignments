package com.phoenix.vehicals.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicals.Vehical;

public class Car extends Vehical implements Movable,Runnable{

	    public void start() {
	    	System.out.println("car started...");
	    }
	    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("car running...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car moving...");
	}
	public void stop() {
    	System.out.println("car stopped...");
    }

}
