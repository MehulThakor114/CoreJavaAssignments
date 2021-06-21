/*
*  Author:mehul.thakor@stltech.in
*  Creation Date: 17-Jun-2021
*  Version:1.0
*  Copyright: Sterlite Technologies Ltd.
*/
package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
	private static PrimeMinister obj;
	private PrimeMinister(){
		
	}
	public void serveNation() {
		   System.out.println("Serving services");
	   }
	public static PrimeMinister getInstance() {
		   if(obj==null) 
		      obj = new PrimeMinister();
		   else
			   System.out.println("already created");
		   return obj;
	   }
}
