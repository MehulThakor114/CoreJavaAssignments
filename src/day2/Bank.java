/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package day2;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("InterestRest is: "+Account.getInterestRate());
		System.out.println();
		//invoking account object using default constructor
		Account acc = new Account();
		acc.setAccNo(55345);
        acc.setOwnerName("Mehul Thakor");
		acc.setBalance(5000);
		acc.setDurationYears(1.5f);
		acc.printDetails();
		acc.calculateInterest();
		System.out.println();
		//invoking account object using parameterized constructor
		Account acc2 = new Account(25345,"Rahul Thakor",5000,1);
		System.out.println();
		acc2.printDetails();
		acc2.calculateInterest();
		System.out.println();
		System.out.println("Total accounts: "+Account.getCount());
		

	}

}
