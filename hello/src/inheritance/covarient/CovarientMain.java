/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance.covarient;

import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovarientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData ed = new EmployeeData();
		System.out.println(ed.getEmployee());
		EmployeeData med = new ManagerData();
		System.out.println(med.getEmployee());
		EmployeeData wed = new WageEmpData();
        System.out.println(wed.getEmployee());
	}

}
