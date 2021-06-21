/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.singleton;

public class Earth {
	private static Earth obj;
	private Earth(){
		
	}
	public void createLife() {
		   System.out.println("Life created");
	   }
	public static Earth getInstance() {
		   if(obj==null) 
		      obj = new Earth();
		   else
			   System.out.println("already created");
		   return obj;
	   }
}
