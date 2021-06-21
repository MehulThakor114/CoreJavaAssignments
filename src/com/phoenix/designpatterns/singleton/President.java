/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.singleton;

public class President {
	private static President obj;
	private President(){
		
	}
	public void representNation() {
		   System.out.println("represented nation");
	   }
	public static President getInstance() {
		   if(obj==null) 
		      obj = new President();
		   else
			   System.out.println("already created");
		   return obj;
	   }
}
