/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.singleton;

public class Sun {
	private static Sun obj;
	private Sun() {
		//Default constructor
	}
   public void giveLight() {
	   System.out.println("Sun shining...");
   }
   public static Sun getInstance() {
	   if(obj==null) 
	      obj = new Sun();
	   else
		   System.out.println("already created");
	   return obj;
   }
   
}
