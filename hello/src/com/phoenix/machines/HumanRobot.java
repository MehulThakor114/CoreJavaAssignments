package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot  extends Robot implements Walkable{

	@Override
	public void Jump() {
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

}
