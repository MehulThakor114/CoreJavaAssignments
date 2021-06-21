package com.phoenix.planets;

public class Earth extends Planet{

	public Earth(int noOfMoons){
		setNoOfMoons(noOfMoons);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Earth moving");
		
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Earth rotating");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Earth revolving");
	}

	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}
	public String toString(){
		
	    return super.toString();
	  }

}
