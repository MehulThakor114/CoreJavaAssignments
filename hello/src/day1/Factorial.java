package day1;

import java.util.Scanner;

public class Factorial {
	
    public static int fact(int num) {
    	int factno=1;
     if(num <= 0) {
    	 if(num==0) {
    		 factno=1;
    		 
    	 }else {
    		 System.out.println(" opps error number is negative");
    	 }
     }
    else { 
    	for(int i=1;i<=num;++i) {
    		factno = factno*i;
    	}
    	}
     return factno;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("factorial of "+num+" is "+Factorial.fact(num));

	}

}
