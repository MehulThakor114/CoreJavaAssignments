package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tiger Moving...");
		
	}

	@Override
	public void Jump() {
		// TODO Auto-generated method stub
		System.out.println("Tiger jumping...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tiger running...");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tiger walking...");
	}

}
