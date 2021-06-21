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

public class inheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(123,"MehulThakor",15000);
		WageEmp wemp = new WageEmp();
		wemp.display();
		System.out.println(emp);
		Manager mn = new Manager();
		mn.showIncentives();
		mn.display();
		System.out.println(mn);
		
		Manager mn2 = new Manager(552,"Rahul Thakor",10000,2000.0);
		mn2.showIncentives();
		mn2.display();
		System.out.println(mn2);
		
		wemp.calculateWage();
		wemp.display();
		System.out.println(wemp);
		WageEmp wemp2 = new WageEmp(554,"karan singh",9,25);
		wemp2.display();
		System.out.println(wemp2);
	}

}
