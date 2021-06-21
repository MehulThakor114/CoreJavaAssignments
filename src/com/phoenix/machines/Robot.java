package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("robot moving...");
	}
		public void processData(){
			System.out.println("robot can process data");
		}
		public void senseInfo(){
			System.out.println("robot can sense info");
		}
	    public void useArtificialIntelligence() {
	    	System.out.println("robot can use AI");
	    }
}
