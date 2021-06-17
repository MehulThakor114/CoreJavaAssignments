package com.phoenix.vehicals.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicals.Vehical;

public class Car extends Vehical implements Movable,Runnable{

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

}
