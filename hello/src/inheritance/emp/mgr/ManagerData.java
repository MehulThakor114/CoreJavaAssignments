/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {
	//overriding getEmployee method
     public Manager getEmployee() {
    	 Manager mg = new Manager(552,"Rahul Thakor",10000,2000.0);
    	 return mg;
     }
}
