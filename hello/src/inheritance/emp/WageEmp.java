/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance.emp;

public class WageEmp extends Employee{
    private int noOfHours;
    private float ratePerHour;
    
    public WageEmp() {
    	
    }
    public WageEmp(int empId,String name,int hours,float rate) {
      super(empId,name,5000);	
      this.noOfHours=hours;
      this.ratePerHour=rate;
    }
    public void calculateWage() {
    	System.out.println("Wage: "+this.noOfHours*this.ratePerHour);
    }
    public void display() {
  	  super.display();
  	}
  	public String toString(){
  	    return super.toString();
  	  }
}
