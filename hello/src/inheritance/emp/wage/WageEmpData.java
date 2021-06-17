/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 11-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

public class WageEmpData extends EmployeeData{
	//overriding getEmployee method
    public WageEmp getEmployee() {
    	WageEmp we = new WageEmp(554,"karan singh",9,25);
    	return we;
    }
}
