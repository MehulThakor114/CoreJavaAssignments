/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 9-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package containment;

import containment.date.*;
import containment.emp.*;
//This is Main class to deal with Employee and Date entity
public class ContainmentMain {
	
	public static void main(String[] args) {
		//invoking employee and Date object
	   Employee emp = new Employee();
	   MyDate date = new MyDate();
	   emp.setEmpId(54325);
	   emp.setName("Mehul Thakor");
	   emp.setBirthDate(date);
	   emp.getEmpId();
	   emp.getName();
	   emp.getBirthDate();
	   System.out.println(emp);
	  
	   Employee emp2 = new Employee(123,"Rahul",date);
	   emp2.Display();
	   
}
}
