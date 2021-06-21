/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package containment.emp;

import containment.date.MyDate;
//This is Employee class representing employee entity
public class Employee {
	//data members
    private int empId;
    private String name;
    private MyDate birthDate;
    //default constructor
    public Employee(){
    	empId = 12345;
    	name = "mehul";
    	birthDate = new MyDate();
    }
  //parameterized constructor
    public Employee(int empId,String name,MyDate birthDate){
    	this.empId = empId;
    	this.name = name;
    	this.birthDate = birthDate;
    }
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public void Display() {
		System.out.println("Employee{"+"\nEmployeeId: "+empId+"\nName: "+name+"\nbirthDate"+birthDate+"\n}");
	}
	 public String toString(){
		    return "Employee{"+"\nEmployeeId: "+empId+"\nName: "+name+"\nbirthDate"+birthDate+"\n}";
		  }
    
}

