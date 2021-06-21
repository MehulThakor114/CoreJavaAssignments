package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot  extends Robot implements Walkable{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("HumanRobot jumping...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HumanRobot running...");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("HumanRobot walking...");
	}
	public void processData(){
		System.out.println("HumanRobot can process data");
	}
	public void senseInfo(){
		System.out.println("HumanRobot can sense info");
	}
    public void useArtificialIntelligence() {
    	System.out.println("HumanRobot can use AI");
    }
}
