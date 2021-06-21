/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Manager(552,"Rahul Thakor",10000,2000.0);
		((Manager)em).display();
		((Manager)em).showIncentives();
		System.out.println();
		Employee em2 =new WageEmp(554,"karan singh",9,25);
		((WageEmp)em2).display();
		((WageEmp)em2).calculateWage();

	}

}
