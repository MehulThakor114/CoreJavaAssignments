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

public class RTTIMain {
	
	public static void showEmpInfo(Employee emp){
		System.out.println(emp);
		if(emp instanceof Manager )
		   ((Manager)emp).showIncentives();
		if(emp instanceof WageEmp)
		   ((WageEmp)emp).calculateWage();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager(552,"Rahul Thakor",10000,2000.0);
		showEmpInfo(mg);
		System.out.println();
		WageEmp we = new WageEmp(554,"karan singh",9,25);
        showEmpInfo(we);
	}

}
