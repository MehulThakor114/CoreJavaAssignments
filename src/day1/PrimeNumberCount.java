package day1;

import java.util.Scanner;

public class PrimeNumberCount {
	public static void primeCount(int count) {
		int check=0;
		for(int i=1;i<=count;i++) {
			for(int j=1;j<=i;j++) {
			if(i%j==0) {
				check++;
			}	}if(check==2) {
				System.out.println(i);
			}
			check=0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PrimeNumberCount.primeCount(num);
   

	}

}
