package day1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void  armstrong(int num)
	{
		int a=0,b,temp;
		temp=num;
		while(num>0) {
			b=num%10;
			num=num/10;
			a=a+(b*b*b);
		}
		if(temp==a) {
			System.out.println("armstrong num");
		}else {
			System.out.println("not armstrong num");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		armstrong(num);

	}

}
