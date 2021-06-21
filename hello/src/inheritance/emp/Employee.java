/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance.emp;

public class Employee {
	//data members
    private int empId;
    private String name;
    private double salary;
    
    public Employee() {
    	empId = 123;
    	name = "Mehul Thakor";
    	salary = 15000.00;
    	
    }
    public Employee(int empId,String name) {
    	this.empId=empId;
    	this.name = name;
    }
    public Employee(int empId,String name,double salary) {
    	this.empId=empId;
    	this.name = name;
        this.salary=salary;
    }
    protected void display() {
		System.out.println("Employee{"+"\nEmployeeId: "+empId+"\nName: "+name+"\nsalary"+salary+"\n}");
	}
	 public String toString(){
		    return "Employee{"+"\nEmployeeId: "+empId+"\nName: "+name+"\nsalary: "+salary+"\n}";
		  }
}
