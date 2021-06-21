package com.phoenix.planets;

public class Jupiter extends Planet{

	public Jupiter(int noOfMoons) {
		setNoOfMoons(noOfMoons);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter moving");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter moving");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter moving");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return false;
	}

}
