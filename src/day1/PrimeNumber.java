package day1;

import java.util.Scanner;

public class PrimeNumber {
	
	public static String prime(int num) {
		String tag = "";
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}		
		}if(count==2)
			tag = "prime number";
		else
			tag = "not prime number";
		
	return tag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(PrimeNumber.prime(num));
   
	}

}
