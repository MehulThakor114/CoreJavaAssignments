/*
 * Author: mehul.thakor.@stltech.in
 * Creation Date: 9-june-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */	
package day2;

// this is Account class represent account entity	
	public class Account {
		//Data members
	    //intances variable
	   private int accNo;
	   private String ownerName;
	   private double balance;
	   private float durationYears;
	   
	   //class or static variable
	   private static float interestRate;
	   private static int count;
	   //static init block
	   static {
		   interestRate = 0.05f;
		   
	   }
	   //default constructor
	   Account(){
		   this.accNo=312498;
		   this.ownerName="Mehul Thakor";
		   this.balance=10000;
		   this.durationYears=2;
		   count++;
	   }
	   //parameterized constructor
	   Account(int accNo,String ownerName,double balance,float years){
		   this.accNo=accNo;
		   this.ownerName=ownerName;
		   this.balance=balance;
		   this.durationYears=years;
		   count++;
	   }
	   // getter and setter methods
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public float getDurationYears() {
		return durationYears;
	}
	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}
	public static float getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	public static int getCount() {
		return count;
	}
	public void calculateInterest() {
		System.out.println("interest amount is "+balance*interestRate*durationYears );
	}
	public void printDetails() {
		System.out.println("AccNo: "+accNo+"\nOwnerName: "+ownerName+"\nbalance "+balance+"\nDurationYears: "
				+durationYears);
	}
	   
	}
