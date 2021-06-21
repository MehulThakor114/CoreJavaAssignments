package day1;

import java.util.Scanner;

public class Fibonacci {
	public static void fibo(int terms) {
		int a=0,b=1,nt;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<terms;i++) {
			nt=a+b;
			a=b;
			b=nt;
			System.out.println(nt);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Fibonacci.fibo(num);

	}

}
